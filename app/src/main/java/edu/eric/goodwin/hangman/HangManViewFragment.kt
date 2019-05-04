package edu.eric.goodwin.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_hanged_man.view.*


class HangManViewFragment(): Fragment() {

    var hangManFigure: HangManFigureView? = null

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




