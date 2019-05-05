package edu.eric.goodwin.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_hanged_man.view.*


class HangManViewFragment: Fragment() {

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



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

            val view = inflater.inflate(R.layout.fragment_hanged_man, container, false)
            this.hangManFigure = view.hangManFigure



            return view

        }

}




