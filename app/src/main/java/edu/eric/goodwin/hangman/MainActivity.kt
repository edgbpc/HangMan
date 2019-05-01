package edu.eric.goodwin.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.util.Log
import android.view.View
import androidx.core.view.updateLayoutParams
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), HangManViewFragment.ButtonListener, hangManFigureView.dataDelegate {


    private var hangedManViewFragment: HangManViewFragment? = null
    private var model: HangManModel? = HangManModel()

    private var hangManFigure: hangManFigureView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayoutPhrase.setVisibility(View.INVISIBLE)
        keyboardLayout.setVisibility(View.INVISIBLE)

        hangedManViewFragment = supportFragmentManager.findFragmentById(R.id.hangedManContainer) as? HangManViewFragment
        if (hangedManViewFragment == null) {
            hangedManViewFragment = HangManViewFragment.newInstance("loadScreen")
            supportFragmentManager.beginTransaction()
                .add(R.id.hangedManContainer, hangedManViewFragment!!)
                .commit()
        }

        startButton.setOnClickListener{
            Log.e("start", "Start Button presses")
            linearLayoutPhrase.setVisibility(View.VISIBLE)
            keyboardLayout.setVisibility(View.VISIBLE)
            startButton.setVisibility(View.INVISIBLE)
            updateBodyParts(0)



        }

    //    hangedManViewFragment?.listener = this
        hangManFigure?.delegate = this

        buttonY.setOnClickListener {
            updateBodyParts(0)
        }

    }

    override fun updateBodyParts(currentParts: Int) {
        var parts = currentParts
        hangedManViewFragment?.hangManFigure?.updateView(parts)
     //   hangManFigure!!.currentBodyParts = 3
    //    hangManFigure!!.invalidate()
    }

    override fun buttonAPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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
       // updateBodyParts(`)
    }

    override fun buttonZPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



}

