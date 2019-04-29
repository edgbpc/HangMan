package edu.eric.goodwin.hangman

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.view.*


class HangManViewFragment(): Fragment() {

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

            val view = inflater.inflate(R.layout.fragment_hanged_man, container, false)

            view.buttonY.setOnClickListener{

            }

            return view

        }

}




