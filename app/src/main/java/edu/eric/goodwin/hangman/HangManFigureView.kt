package edu.eric.goodwin.hangman

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View

class HangManFigureView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    interface DataDelegate{
        fun updateHangManFigureView(incorrectGuesses: Int)
    }

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var colorBorder = Color.BLACK
    private var size = 180
    private var borderWidth = 4.0f

    private var currentBodyParts = 6

    var delegate: DataDelegate? = null

    override fun onDraw(canvas: Canvas) {


        Log.i("ondraw", "ondraw called")
        super.onDraw(canvas)

        when (currentBodyParts) {

            0-> {

            }

            1 -> {
                drawHead(canvas)
            }
            2 -> {
                drawHead(canvas)
                drawBody(canvas)
            }
            3 -> {
                drawHead(canvas)
                drawBody(canvas)
                drawLeftArm(canvas)
            }
            4 -> {
                drawHead(canvas)
                drawBody(canvas)
                drawLeftArm(canvas)
                drawLeftFoot(canvas)

            }
            5 -> {
                drawHead(canvas)
                drawBody(canvas)
                drawLeftArm(canvas)
                drawLeftFoot(canvas)
                drawRightArm(canvas)
            }
            6 -> {
                drawHead(canvas)
                drawBody(canvas)
                drawLeftArm(canvas)
                drawLeftFoot(canvas)
                drawRightArm(canvas)
                drawRightFoot(canvas)
                Log.i("switch", "dead")
            }
            else -> {
                drawHead(canvas)
                drawBody(canvas)
                drawRightArm(canvas)
                drawLeftArm(canvas)
                drawLeftFoot(canvas)
                drawRightFoot(canvas)
                Log.i("switch", "dead")
            }
        }

        if (currentBodyParts == 6) {
            drawHead(canvas)
            drawBody(canvas)
            drawRightArm(canvas)
            drawLeftArm(canvas)
            drawLeftFoot(canvas)
            drawRightFoot(canvas)
            currentBodyParts = 0
        }


    }

    private fun drawHead(canvas: Canvas) {

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        val radius = size / 2f

        canvas.drawCircle(size / .75f, size / 2f, radius - borderWidth, paint)

    }

    private fun drawBody(canvas: Canvas) {
        val startY = 180F
        val startX = 240F
        val stopY = 500F
        val stopX = 240F

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }

    private fun drawRightArm(canvas: Canvas) {

        val startY = 280F
        val startX = 240F
        val stopY = 225f
        val stopX = 150f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)
    }

    private fun drawLeftArm(canvas: Canvas) {

        val startY = 280F
        val startX = 240F
        val stopY = 225f
        val stopX = 330f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)
    }

    private fun drawLeftFoot(canvas: Canvas) {
        val startY = 500F
        val startX = 240F
        val stopY = 550f
        val stopX = 300f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }

    private fun drawRightFoot(canvas: Canvas) {

        val startY = 500F
        val startX = 240F
        val stopY = 550f
        val stopX = 180f


        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }


    fun updateView(currentParts: Int) {
        currentBodyParts = currentParts
        invalidate()
    }
}

