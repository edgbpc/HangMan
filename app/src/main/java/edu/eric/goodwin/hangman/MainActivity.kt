package edu.eric.goodwin.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_game_field.*


class MainActivity : AppCompatActivity(), PlayingFieldViewFragment.ButtonListener, HangManFigureView.dataDelegate {


    private var hangedManViewFragment: HangManViewFragment? = null
    private var model: HangManModel? = HangManModel()
    private var playingFieldViewFragment: PlayingFieldViewFragment? = null
    private var guess: Char = ' '

    private var hangManFigure: HangManFigureView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        hangedManViewFragment = supportFragmentManager.findFragmentById(R.id.hangedManContainer) as? HangManViewFragment
        if (hangedManViewFragment == null) {
            hangedManViewFragment = HangManViewFragment.newInstance("loadScreen")
            supportFragmentManager.beginTransaction()
                .add(R.id.hangedManContainer, hangedManViewFragment!!)
                .commit()
        }

        startButton.setOnClickListener{
            Log.e("start", "Start Button presses")
            startButton.setVisibility(View.INVISIBLE)

            playingFieldViewFragment = supportFragmentManager.findFragmentById(R.id.playingFieldContainer) as? PlayingFieldViewFragment
            if (playingFieldViewFragment == null) {
                playingFieldViewFragment = PlayingFieldViewFragment()
                supportFragmentManager.beginTransaction()
                    .add(R.id.playingFieldContainer, playingFieldViewFragment!!)
                    .commit()

            }



            playingFieldViewFragment?.listener = this
            hangManFigure?.delegate = this
        }

    }

    override fun updateHangManFigureView(incorrectGuesses: Int) {
        var incorrectGuessesForDisplayImage = incorrectGuesses
        hangedManViewFragment?.hangManFigure?.updateView(incorrectGuessesForDisplayImage)
    }


    override fun startGamePressed() {
        if (startGame.text == "Start Game") {
            updateHangManFigureView(0)
            model!!.selectPhrase()
            playingFieldViewFragment?.receivePhrase(model!!.obfuscatedPhrase)
            model!!.countCharactersInPhrase()

            Log.wtf("Phrase", model!!.showPhrase())

        } else if (startGame.text == "New Game") {
            model!!.resetGame()
            playingFieldViewFragment?.receivePhrase(model!!.obfuscatedPhrase)
            model!!.countCharactersInPhrase()
            playingFieldViewFragment!!.enableAllKeyboardButtons()
            Log.wtf("New Game - Phrase", model!!.showPhrase())
        }

    }

    private fun checkGuess(guess: Char){
        model!!.checkCharacter(guess)
        if (model!!.guess == true){
            Toast.makeText(this, "Correct!  You survived another round.", Toast.LENGTH_SHORT).show()
            playingFieldViewFragment?.receivePhrase(model!!.createDisplayWordAndReturn())
        } else {
            Toast.makeText(this, "Uh Oh.  That was incorrect!", Toast.LENGTH_SHORT).show()

            updateHangManFigureView(model!!.numIncorrectGuesses)
        }
        checkIfWon()
        checkIfLost()
    }

    private fun checkIfLost(){
        model!!.checkLostCondition()
        if (model!!.gameLost) {
            Toast.makeText(this, "Doh~! You're a goner", Toast.LENGTH_SHORT).show()
            playingFieldViewFragment!!.toggleStartGameButton()
            playingFieldViewFragment!!.disableAllKeyboardButtons()
        }
    }

    private fun checkIfWon() {
        if (model!!.gameWon) {
          Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show()
          playingFieldViewFragment!!.toggleStartGameButton()
          playingFieldViewFragment!!.disableAllKeyboardButtons()



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

