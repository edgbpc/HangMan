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

        view.phraseViewText.text = " not fucking null"

        //region onCLickListeners

        view.buttonA.setOnClickListener {
            listener?.buttonAPressed()
            buttonA.setEnabled(false)
        }
        view.buttonB.setOnClickListener {
            listener?.buttonAPressed()
            buttonB.setEnabled(false)
        }
        view.buttonC.setOnClickListener {
            listener?.buttonAPressed()
            buttonC.setEnabled(false)
        }
        view.buttonD.setOnClickListener {
            listener?.buttonAPressed()
            buttonD.setEnabled(false)
        }
        view.buttonE.setOnClickListener {
            listener?.buttonAPressed()
            buttonE.setEnabled(false)
        }
        view.buttonF.setOnClickListener {
            listener?.buttonAPressed()
            buttonF.setEnabled(false)
        }
        view.buttonG.setOnClickListener {
            listener?.buttonAPressed()
            buttonG.setEnabled(false)
        }
        view.buttonH.setOnClickListener {
            listener?.buttonAPressed()
            buttonH.setEnabled(false)
        }
        view.buttonI.setOnClickListener {
            listener?.buttonAPressed()
            buttonI.setEnabled(false)
        }
        view.buttonJ.setOnClickListener {
            listener?.buttonAPressed()
            buttonJ.setEnabled(false)
        }
        view.buttonK.setOnClickListener {
            listener?.buttonAPressed()
            buttonK.setEnabled(false)
        }
        view.buttonL.setOnClickListener {
            listener?.buttonAPressed()
            buttonL.setEnabled(false)
        }
        view.buttonM.setOnClickListener {
            listener?.buttonAPressed()
            buttonM.setEnabled(false)
        }
        view.buttonN.setOnClickListener {
            listener?.buttonAPressed()
            buttonN.setEnabled(false)
        }
        view.buttonO.setOnClickListener {
            listener?.buttonAPressed()
            buttonO.setEnabled(false)
        }
        view.buttonP.setOnClickListener {
            listener?.buttonAPressed()
            buttonP.setEnabled(false)
        }
        view.buttonQ.setOnClickListener {
            listener?.buttonAPressed()
            buttonQ.setEnabled(false)
        }
        view.buttonR.setOnClickListener {
            listener?.buttonAPressed()
            buttonR.setEnabled(false)
        }
        view.buttonS.setOnClickListener {
            listener?.buttonAPressed()
            buttonS.setEnabled(false)
        }
        view.buttonT.setOnClickListener {
            listener?.buttonAPressed()
            buttonT.setEnabled(false)
        }
        view.buttonU.setOnClickListener {
            listener?.buttonAPressed()
            buttonU.setEnabled(false)
        }
        view.buttonV.setOnClickListener {
            listener?.buttonAPressed()
            buttonV.setEnabled(false)
        }
        view.buttonW.setOnClickListener {
            listener?.buttonAPressed()
            buttonW.setEnabled(false)
        }
        view.buttonX.setOnClickListener {
            listener?.buttonAPressed()
            buttonX.setEnabled(false)
        }
        view.buttonY.setOnClickListener {
            listener?.buttonYPressed()
            buttonY.setEnabled(false)
        }
        view.buttonZ.setOnClickListener {
            listener?.buttonAPressed()
            buttonZ.setEnabled(false)
        }


        view.startGame.setOnClickListener {
          listener?.startGamePressed()
            startGame.setEnabled(false)
        }

        //endregion

        return view

    }

    fun receivePhrase(phrase: String){
        var phraseViewText = activity!!.findViewById(R.id.phraseViewText) as TextView
        phraseViewText.setText(phrase)

       // this.phrase = phrase

    }

}