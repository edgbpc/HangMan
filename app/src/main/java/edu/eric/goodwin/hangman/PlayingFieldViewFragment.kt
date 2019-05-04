package edu.eric.goodwin.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_game_field.*
import kotlinx.android.synthetic.main.fragment_game_field.view.*

class PlayingFieldViewFragment(): Fragment() {

    var listener: ButtonListener? = null

    interface ButtonListener {
        fun buttonAPressed()
        fun buttonBPressed()
        fun buttonCPressed()
        fun buttonDPressed()
        fun buttonEPressed()
        fun buttonFPressed()
        fun buttonGPressed()
        fun buttonHPressed()
        fun buttonIPressed()
        fun buttonJPressed()
        fun buttonKPressed()
        fun buttonLPressed()
        fun buttonMPressed()
        fun buttonNPressed()
        fun buttonOPressed()
        fun buttonPPressed()
        fun buttonQPressed()
        fun buttonRPressed()
        fun buttonSPressed()
        fun buttonTPressed()
        fun buttonUPressed()
        fun buttonVPressed()
        fun buttonWPressed()
        fun buttonXPressed()
        fun buttonYPressed()
        fun buttonZPressed()
        fun startGamePressed()


    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)



    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_game_field, container, false)

        view.phraseViewText.text = " "

        //region onCLickListeners

        view.buttonA.setOnClickListener {
            listener?.buttonAPressed()
            buttonA.setEnabled(false)
        }
        view.buttonB.setOnClickListener {
            listener?.buttonBPressed()
            buttonB.setEnabled(false)
        }
        view.buttonC.setOnClickListener {
            listener?.buttonCPressed()
            buttonC.setEnabled(false)
        }
        view.buttonD.setOnClickListener {
            listener?.buttonDPressed()
            buttonD.setEnabled(false)
        }
        view.buttonE.setOnClickListener {
            listener?.buttonEPressed()
            buttonE.setEnabled(false)
        }
        view.buttonF.setOnClickListener {
            listener?.buttonFPressed()
            buttonF.setEnabled(false)
        }
        view.buttonG.setOnClickListener {
            listener?.buttonGPressed()
            buttonG.setEnabled(false)
        }
        view.buttonH.setOnClickListener {
            listener?.buttonHPressed()
            buttonH.setEnabled(false)
        }
        view.buttonI.setOnClickListener {
            listener?.buttonIPressed()
            buttonI.setEnabled(false)
        }
        view.buttonJ.setOnClickListener {
            listener?.buttonJPressed()
            buttonJ.setEnabled(false)
        }
        view.buttonK.setOnClickListener {
            listener?.buttonKPressed()
            buttonK.setEnabled(false)
        }
        view.buttonL.setOnClickListener {
            listener?.buttonLPressed()
            buttonL.setEnabled(false)
        }
        view.buttonM.setOnClickListener {
            listener?.buttonMPressed()
            buttonM.setEnabled(false)
        }
        view.buttonN.setOnClickListener {
            listener?.buttonNPressed()
            buttonN.setEnabled(false)
        }
        view.buttonO.setOnClickListener {
            listener?.buttonOPressed()
            buttonO.setEnabled(false)
        }
        view.buttonP.setOnClickListener {
            listener?.buttonPPressed()
            buttonP.setEnabled(false)
        }
        view.buttonQ.setOnClickListener {
            listener?.buttonQPressed()
            buttonQ.setEnabled(false)
        }
        view.buttonR.setOnClickListener {
            listener?.buttonRPressed()
            buttonR.setEnabled(false)
        }
        view.buttonS.setOnClickListener {
            listener?.buttonSPressed()
            buttonS.setEnabled(false)
        }
        view.buttonT.setOnClickListener {
            listener?.buttonTPressed()
            buttonT.setEnabled(false)
        }
        view.buttonU.setOnClickListener {
            listener?.buttonUPressed()
            buttonU.setEnabled(false)
        }
        view.buttonV.setOnClickListener {
            listener?.buttonVPressed()
            buttonV.setEnabled(false)
        }
        view.buttonW.setOnClickListener {
            listener?.buttonWPressed()
            buttonW.setEnabled(false)
        }
        view.buttonX.setOnClickListener {
            listener?.buttonXPressed()
            buttonX.setEnabled(false)
        }
        view.buttonY.setOnClickListener {
            listener?.buttonYPressed()
            buttonY.setEnabled(false)
        }
        view.buttonZ.setOnClickListener {
            listener?.buttonZPressed()
            buttonZ.setEnabled(false)
        }


        view.startGame.setOnClickListener {
          listener?.startGamePressed()
            startGame.setText("New Game")
            toggleStartGameButton()
        }

        //endregion

        return view

    }

    fun receivePhrase(phrase: String){
        var phraseViewText = activity!!.findViewById(R.id.phraseViewText) as TextView
        phraseViewText.setText(phrase)
       // this.phrase = phrase
    }

    fun toggleStartGameButton() {
        if (startGame.isEnabled) {
            startGame.setEnabled(false)
        } else {
            startGame.setEnabled(true)
        }
    }

    fun disableAllKeyboardButtons() {
        buttonA.setEnabled(false)
        buttonB.setEnabled(false)
        buttonC.setEnabled(false)
        buttonD.setEnabled(false)
        buttonE.setEnabled(false)
        buttonF.setEnabled(false)
        buttonG.setEnabled(false)
        buttonH.setEnabled(false)
        buttonI.setEnabled(false)
        buttonJ.setEnabled(false)
        buttonK.setEnabled(false)
        buttonL.setEnabled(false)
        buttonM.setEnabled(false)
        buttonN.setEnabled(false)
        buttonO.setEnabled(false)
        buttonP.setEnabled(false)
        buttonQ.setEnabled(false)
        buttonR.setEnabled(false)
        buttonS.setEnabled(false)
        buttonT.setEnabled(false)
        buttonU.setEnabled(false)
        buttonV.setEnabled(false)
        buttonW.setEnabled(false)
        buttonX.setEnabled(false)
        buttonY.setEnabled(false)
        buttonZ.setEnabled(false)
    }

    fun enableAllKeyboardButtons() {
        buttonA.setEnabled(true)
        buttonB.setEnabled(true)
        buttonC.setEnabled(true)
        buttonD.setEnabled(true)
        buttonE.setEnabled(true)
        buttonF.setEnabled(true)
        buttonG.setEnabled(true)
        buttonH.setEnabled(true)
        buttonI.setEnabled(true)
        buttonJ.setEnabled(true)
        buttonK.setEnabled(true)
        buttonL.setEnabled(true)
        buttonM.setEnabled(true)
        buttonN.setEnabled(true)
        buttonO.setEnabled(true)
        buttonP.setEnabled(true)
        buttonQ.setEnabled(true)
        buttonR.setEnabled(true)
        buttonS.setEnabled(true)
        buttonT.setEnabled(true)
        buttonU.setEnabled(true)
        buttonV.setEnabled(true)
        buttonW.setEnabled(true)
        buttonX.setEnabled(true)
        buttonY.setEnabled(true)
        buttonZ.setEnabled(true)
    }
}