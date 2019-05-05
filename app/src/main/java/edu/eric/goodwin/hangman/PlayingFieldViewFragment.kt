package edu.eric.goodwin.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_game_field.*
import kotlinx.android.synthetic.main.fragment_game_field.view.*

class PlayingFieldViewFragment: Fragment() {

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



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_game_field, container, false)

        view.phraseViewText.text = " "

        //load keyboard buttons disabled by default

        //region disable keyboard
        view.buttonA.isEnabled = false
        view.buttonB.isEnabled = false
        view.buttonC.isEnabled = false
        view.buttonD.isEnabled = false
        view.buttonE.isEnabled = false
        view.buttonF.isEnabled = false
        view.buttonG.isEnabled = false
        view.buttonH.isEnabled = false
        view.buttonI.isEnabled = false
        view.buttonJ.isEnabled = false
        view.buttonK.isEnabled = false
        view.buttonL.isEnabled = false
        view.buttonM.isEnabled = false
        view.buttonN.isEnabled = false
        view.buttonO.isEnabled = false
        view.buttonP.isEnabled = false
        view.buttonQ.isEnabled = false
        view.buttonR.isEnabled = false
        view.buttonS.isEnabled = false
        view.buttonT.isEnabled = false
        view.buttonU.isEnabled = false
        view.buttonV.isEnabled = false
        view.buttonW.isEnabled = false
        view.buttonX.isEnabled = false
        view.buttonY.isEnabled = false
        view.buttonZ.isEnabled = false

        //endregion

        //region onClickListeners

        view.buttonA.setOnClickListener {
            listener?.buttonAPressed()
            buttonA.isEnabled = false
        }
        view.buttonB.setOnClickListener {
            listener?.buttonBPressed()
            buttonB.isEnabled = false
        }
        view.buttonC.setOnClickListener {
            listener?.buttonCPressed()
            buttonC.isEnabled = false
        }
        view.buttonD.setOnClickListener {
            listener?.buttonDPressed()
            buttonD.isEnabled = false
        }
        view.buttonE.setOnClickListener {
            listener?.buttonEPressed()
            buttonE.isEnabled = false
        }
        view.buttonF.setOnClickListener {
            listener?.buttonFPressed()
            buttonF.isEnabled = false
        }
        view.buttonG.setOnClickListener {
            listener?.buttonGPressed()
            buttonG.isEnabled = false
        }
        view.buttonH.setOnClickListener {
            listener?.buttonHPressed()
            buttonH.isEnabled = false
        }
        view.buttonI.setOnClickListener {
            listener?.buttonIPressed()
            buttonI.isEnabled = false
        }
        view.buttonJ.setOnClickListener {
            listener?.buttonJPressed()
            buttonJ.isEnabled = false
        }
        view.buttonK.setOnClickListener {
            listener?.buttonKPressed()
            buttonK.isEnabled = false
        }
        view.buttonL.setOnClickListener {
            listener?.buttonLPressed()
            buttonL.isEnabled = false
        }
        view.buttonM.setOnClickListener {
            listener?.buttonMPressed()
            buttonM.isEnabled = false
        }
        view.buttonN.setOnClickListener {
            listener?.buttonNPressed()
            buttonN.isEnabled = false
        }
        view.buttonO.setOnClickListener {
            listener?.buttonOPressed()
            buttonO.isEnabled = false
        }
        view.buttonP.setOnClickListener {
            listener?.buttonPPressed()
            buttonP.isEnabled = false
        }
        view.buttonQ.setOnClickListener {
            listener?.buttonQPressed()
            buttonQ.isEnabled = false
        }
        view.buttonR.setOnClickListener {
            listener?.buttonRPressed()
            buttonR.isEnabled = false
        }
        view.buttonS.setOnClickListener {
            listener?.buttonSPressed()
            buttonS.isEnabled = false
        }
        view.buttonT.setOnClickListener {
            listener?.buttonTPressed()
            buttonT.isEnabled = false
        }
        view.buttonU.setOnClickListener {
            listener?.buttonUPressed()
            buttonU.isEnabled = false
        }
        view.buttonV.setOnClickListener {
            listener?.buttonVPressed()
            buttonV.isEnabled = false
        }
        view.buttonW.setOnClickListener {
            listener?.buttonWPressed()
            buttonW.isEnabled = false
        }
        view.buttonX.setOnClickListener {
            listener?.buttonXPressed()
            buttonX.isEnabled = false
        }
        view.buttonY.setOnClickListener {
            listener?.buttonYPressed()
            buttonY.isEnabled = false
        }
        view.buttonZ.setOnClickListener {
            listener?.buttonZPressed()
            buttonZ.isEnabled = false
        }

        view.startGame.setOnClickListener {
          listener?.startGamePressed()
          toggleStartGameButton()
        }

        //endregion

       return view

    }

    fun receivePhrase(phrase: String){
        val phraseViewText = activity!!.findViewById(R.id.phraseViewText) as TextView
        phraseViewText.text = phrase
       // this.phrase = phrase
    }

    fun toggleStartGameButton() {
        startGame.isEnabled = !startGame.isEnabled
    }

    fun disableAllKeyboardButtons() {
        buttonA.isEnabled = false
        buttonB.isEnabled = false
        buttonC.isEnabled = false
        buttonD.isEnabled = false
        buttonE.isEnabled = false
        buttonF.isEnabled = false
        buttonG.isEnabled = false
        buttonH.isEnabled = false
        buttonI.isEnabled = false
        buttonJ.isEnabled = false
        buttonK.isEnabled = false
        buttonL.isEnabled = false
        buttonM.isEnabled = false
        buttonN.isEnabled = false
        buttonO.isEnabled = false
        buttonP.isEnabled = false
        buttonQ.isEnabled = false
        buttonR.isEnabled = false
        buttonS.isEnabled = false
        buttonT.isEnabled = false
        buttonU.isEnabled = false
        buttonV.isEnabled = false
        buttonW.isEnabled = false
        buttonX.isEnabled = false
        buttonY.isEnabled = false
        buttonZ.isEnabled = false
    }

    fun enableAllKeyboardButtons() {
        buttonA.isEnabled = true
        buttonB.isEnabled = true
        buttonC.isEnabled = true
        buttonD.isEnabled = true
        buttonE.isEnabled = true
        buttonF.isEnabled = true
        buttonG.isEnabled = true
        buttonH.isEnabled = true
        buttonI.isEnabled = true
        buttonJ.isEnabled = true
        buttonK.isEnabled = true
        buttonL.isEnabled = true
        buttonM.isEnabled = true
        buttonN.isEnabled = true
        buttonO.isEnabled = true
        buttonP.isEnabled = true
        buttonQ.isEnabled = true
        buttonR.isEnabled = true
        buttonS.isEnabled = true
        buttonT.isEnabled = true
        buttonU.isEnabled = true
        buttonV.isEnabled = true
        buttonW.isEnabled = true
        buttonX.isEnabled = true
        buttonY.isEnabled = true
        buttonZ.isEnabled = true
    }
}