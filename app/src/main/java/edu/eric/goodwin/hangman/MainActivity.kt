package edu.eric.goodwin.hangman

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import android.os.SystemClock
import kotlinx.android.synthetic.main.fragment_game_field.*


class MainActivity : AppCompatActivity(), PlayingFieldViewFragment.ButtonListener, HangManFigureView.DataDelegate {


    private var hangedManViewFragment: HangManViewFragment? = null
    private var model: HangManModel? = HangManModel()
    private var playingFieldViewFragment: PlayingFieldViewFragment? = null
    private var guess: Char = ' '
    private var hangManFigure: HangManFigureView? = null
    val generator = NotificationGenerator()



    fun createNotification() {
        val title = "Hang Man misses you!"
        val body = "Don't you want to play some more, Dave?."
        val notification = generator.buildNotificationWith(this, title, body)
        val notificationIntent = Intent(this, MyNotificationPublisher::class.java)
        notificationIntent.putExtra(MyNotificationPublisher.NOTIFICATION_ID, 1)
        notificationIntent.putExtra(MyNotificationPublisher.NOTIFICATION, notification)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT)
        val futureInMillis = SystemClock.elapsedRealtime() + 60000
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, futureInMillis, pendingIntent)


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generator.createNotificationChannel(this)
     //   createNotification()

        hangedManViewFragment = supportFragmentManager.findFragmentById(R.id.hangedManContainer) as? HangManViewFragment
        if (hangedManViewFragment == null) {
            hangedManViewFragment = HangManViewFragment.newInstance("loadScreen")
            supportFragmentManager.beginTransaction()
                .add(R.id.hangedManContainer, hangedManViewFragment!!)
                .commit()
        }

        startButton.setOnClickListener {
            Log.e("start", "Start Button pressed")
            startButton.visibility = View.INVISIBLE


            playingFieldViewFragment =
                supportFragmentManager.findFragmentById(R.id.playingFieldContainer) as? PlayingFieldViewFragment
            if (playingFieldViewFragment == null) {
                playingFieldViewFragment = PlayingFieldViewFragment()
                supportFragmentManager.beginTransaction()
                    .add(R.id.playingFieldContainer, playingFieldViewFragment!!)
                    .commit()

            }

            playingFieldViewFragment?.listener = this
            hangManFigure?.delegate = this



        }

        model!!.numIncorrectGuesses = 6
        updateHangManFigureView(model!!.numIncorrectGuesses)

    }

    // part of this override I got help from Joe Carmody.
    // the logic from If-Else logic is mine but the builder logic is from Joe.
    // I don't really understand what the { _. _ -> is doing
    // have to be on the Main Screen actually exit the app.

//    override fun onDestroy() {
//        Log.wtf("onDestory", "onDestroyed called")
//       // createNotification()
//        super.onDestroy()
//    }
//
    override fun onStop() {
        Log.wtf("onStop", "onStop called")
        createNotification()
        super.onStop()
    }

    override fun onResume() {
        Log.wtf("onResume", "onResume called")
        updateHangManFigureView(model!!.numIncorrectGuesses)
        super.onResume()
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.chickenTest)
        builder.setMessage(R.string.title)
        builder.setCancelable(false)
        builder.setPositiveButton(R.string.yes) { _, _ ->
            resetScreens()
        }
        builder.setNegativeButton(R.string.no) { _, _ ->
        }
        builder.show()
    }

    override fun updateHangManFigureView(incorrectGuesses: Int) {
        hangedManViewFragment?.hangManFigure?.updateView(incorrectGuesses)
    }

    private fun startANewGame(){
        updateHangManFigureView(0)
        model!!.resetGame()
        model!!.selectPhrase()
        playingFieldViewFragment?.receivePhrase(model!!.obfuscatedPhrase)
        model!!.countCharactersInPhrase()
        playingFieldViewFragment!!.enableAllKeyboardButtons()

        Log.wtf("Phrase", model!!.showPhrase())
    }

    override fun startGamePressed() {
        startANewGame()
    }

    private fun checkGuess(guess: Char){
        model!!.checkCharacter(guess)
        if (model!!.guess){
            Toast.makeText(this, "Correct!  You survived another round.", Toast.LENGTH_SHORT).show()
            playingFieldViewFragment?.receivePhrase(model!!.createDisplayWordAndReturn())
        } else {
            Toast.makeText(this, "Uh Oh.  That was incorrect!", Toast.LENGTH_SHORT).show()

            updateHangManFigureView(model!!.numIncorrectGuesses)
        }
        checkIfWon()
        checkIfLost()
    }

    private fun resetScreens() {
        if (playingFieldViewFragment == null) {
            finish()
        } else {
            supportFragmentManager.beginTransaction()
                .remove(playingFieldViewFragment!!)
                .commit()
            startButton.visibility = View.VISIBLE
            playingFieldViewFragment = null
            supportFragmentManager.beginTransaction()
                .detach(hangedManViewFragment!!)
                .attach(hangedManViewFragment!!)
                .commit()

        }
    }

    private fun newGamePopUp(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.newGameTitle)
        builder.setMessage(R.string.newGameMessage)
        builder.setCancelable(false)
        builder.setPositiveButton(R.string.newGameYes) { _, _ ->
            startANewGame()
        }
        builder.setNegativeButton(R.string.newGameNo) { _, _ ->
            resetScreens()
        }
        builder.show()
    }

    private fun checkIfLost(){
        model!!.checkLostCondition()
        if (model!!.gameLost) {
            Toast.makeText(this, "Doh~! You're a goner.", Toast.LENGTH_SHORT).show()
            playingFieldViewFragment!!.disableAllKeyboardButtons()
            playingFieldViewFragment!!.receivePhrase("\"" + model!!.exposeThePhrase() + "\"\n was the phrase.")
            newGamePopUp()

        }
    }

    private fun checkIfWon() {
        if (model!!.gameWon) {
          Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show()
          playingFieldViewFragment!!.disableAllKeyboardButtons()
          newGamePopUp()



        }

    }

    //region keyboard button overrides

    override fun buttonAPressed() {
        guess = 'a'
        checkGuess(guess)
    }

    override fun buttonBPressed() {
        guess = 'b'
        checkGuess(guess)
    }

    override fun buttonCPressed() {
        guess = 'c'
        checkGuess(guess)
    }

    override fun buttonDPressed() {
        guess = 'd'
        checkGuess(guess)
    }

    override fun buttonEPressed() {
        guess = 'e'
        checkGuess(guess)
    }

    override fun buttonFPressed() {
        guess = 'f'
        checkGuess(guess)
    }

    override fun buttonGPressed() {
        guess = 'g'
        checkGuess(guess)
    }

    override fun buttonHPressed() {
        guess = 'h'
        checkGuess(guess)
    }

    override fun buttonIPressed() {
        guess = 'i'
        checkGuess(guess)
    }

    override fun buttonJPressed() {
        guess = 'j'
        checkGuess(guess)
    }

    override fun buttonKPressed() {
        guess = 'k'
        checkGuess(guess)
    }

    override fun buttonLPressed() {
        guess = 'l'
        checkGuess(guess)
    }

    override fun buttonMPressed() {
        guess = 'm'
        checkGuess(guess)
    }

    override fun buttonNPressed() {
        guess = 'n'
        checkGuess(guess)
    }

    override fun buttonOPressed() {
        guess = 'o'
        checkGuess(guess)    }

    override fun buttonPPressed() {
        guess = 'p'
        checkGuess(guess)
    }

    override fun buttonQPressed() {
        guess = 'q'
        checkGuess(guess)
    }

    override fun buttonRPressed() {
        guess = 'r'
        checkGuess(guess)
    }

    override fun buttonSPressed() {
        guess = 's'
        checkGuess(guess)
    }

    override fun buttonTPressed() {
        guess = 't'
        checkGuess(guess)
    }

    override fun buttonUPressed() {
        guess = 'u'
        checkGuess(guess)
    }

    override fun buttonVPressed() {
        guess = 'v'
        checkGuess(guess)
    }

    override fun buttonWPressed() {
        guess = 'w'
        checkGuess(guess)
    }

    override fun buttonXPressed() {
        guess = 'x'
        checkGuess(guess)
    }

    override fun buttonYPressed() {
        guess = 'y'
        checkGuess(guess)
    }

    override fun buttonZPressed() {
        guess = 'z'
        checkGuess(guess)
    }
    //endregion


}

