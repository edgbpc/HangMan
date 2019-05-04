package edu.eric.goodwin.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_game_field.*


class MainActivity : AppCompatActivity(), PlayingFieldViewFragment.ButtonListener, HangManFigureView.dataDelegate {


    private var hangedManViewFragment: HangManViewFragment? = null
    private var model: HangManModel? = HangManModel()
    private var playingFieldViewFragment: PlayingFieldViewFragment? = null

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
         //   updateBodyParts(0)

            playingFieldViewFragment = supportFragmentManager.findFragmentById(R.id.playingFieldContainer) as? PlayingFieldViewFragment
            if (playingFieldViewFragment == null) {
                playingFieldViewFragment = PlayingFieldViewFragment()
                supportFragmentManager.beginTransaction()
                    .add(R.id.playingFieldContainer, playingFieldViewFragment!!)
                    .commit()

            }



            playingFieldViewFragment?.listener = this
            hangManFigure?.delegate = this
            model!!.selectPhrase()
           // playingFieldViewFragment?.receivePhrase(model!!.selectedPhrase)

        }

    }

    override fun updateBodyParts(currentParts: Int) {
        var parts = currentParts
        hangedManViewFragment?.hangManFigure?.updateView(parts)
     //   hangManFigure!!.currentBodyParts = 3
    //    hangManFigure!!.invalidate()
    }

    //region buttonOverrides

    override fun startGamePressed() {
        updateBodyParts(0)
        model!!.selectPhrase()
        playingFieldViewFragment?.receivePhrase(model!!.obfuscatedPhrase)
    }

    override fun buttonAPressed() {



    }

    override fun buttonBPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonCPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonDPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonEPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonFPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonGPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonHPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonIPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonJPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonKPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonLPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonMPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonNPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonOPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonPPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonQPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonRPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonSPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonTPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonUPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonVPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonWPressed() {

    }

    override fun buttonXPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun buttonYPressed() {
        Log.wtf("Y button", "why do you hate me?")
       updateBodyParts(3)
    }

    override fun buttonZPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //endregion


}

