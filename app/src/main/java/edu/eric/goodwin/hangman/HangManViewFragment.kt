package edu.eric.goodwin.hangman

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_hanged_man.*
import kotlinx.android.synthetic.main.fragment_hanged_man.view.*


class HangManViewFragment(): Fragment() {

    //currenly ButtonListener unused.  moved buttons to activity_main while i figure out how to update the data for the
    //hang man figure

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


    }

    var listener: ButtonListener? = null
    var hangManFigure: hangManFigureView? = null

    companion object {
        fun newInstance(mode: String): HangManViewFragment {
            val args = Bundle()
            args.putString("mode", mode)
            val fragment = HangManViewFragment()
            fragment.arguments = args
            return fragment

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mode = arguments!!.getString("mode")


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

            var view = inflater.inflate(R.layout.fragment_hanged_man, container, false)
        this.hangManFigure = view.hangManFigure

            return view

        }

}




