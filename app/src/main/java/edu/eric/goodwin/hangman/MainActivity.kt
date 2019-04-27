package edu.eric.goodwin.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var hangedManViewFragment: HangManViewFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hangedManViewFragment = supportFragmentManager.findFragmentById(R.id.hangedManContainer) as? HangManViewFragment
        if (hangedManViewFragment == null) {
            hangedManViewFragment = HangManViewFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.hangedManContainer, hangedManViewFragment!!)
                .commit()
        }
    }
}

