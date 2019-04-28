package edu.eric.goodwin.hangman

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import javax.security.auth.login.LoginException

class hangManFigureView: View {

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)


    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var colorBorder = Color.BLACK
    private var size = 180
    private var borderWidth = 4.0f

    private var currentBodyParts = 6

    override fun onDraw(canvas: Canvas) {

        Log.i("ondraw", "ondraw called")
        super.onDraw(canvas)


        when (currentBodyParts) {
            1 -> {
                drawHead(canvas)
            }
            2->{
                drawHead(canvas)
                drawBody(canvas)
            }
            3->{
                drawHead(canvas)
                drawBody(canvas)
                drawLeftArm(canvas)
            }
            4-> {
                drawHead(canvas)
                drawBody(canvas)
                drawLeftArm(canvas)
                drawLeftFoot(canvas)

            }
            5->{
                drawHead(canvas)
                drawBody(canvas)
                drawLeftArm(canvas)
                drawLeftFoot(canvas)
                drawRightArm(canvas)
            }
            6->
            {
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
            currentBodyParts = 0;
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
        var startY = 180F
        var startX = 240F
        var stopY = 500F
        var stopX = 240F

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }

    private fun drawRightArm(canvas: Canvas) {

        var startY = 280F
        var startX = 240F
        var stopY = 225f
        var stopX = 150f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)
    }

    private fun drawLeftArm(canvas: Canvas) {

        var startY = 280F
        var startX = 240F
        var stopY = 225f
        var stopX = 330f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)
    }

    private fun drawLeftFoot(canvas: Canvas) {
        var startY = 500F
        var startX = 240F
        var stopY = 550f
        var stopX = 300f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }

    private fun drawRightFoot(canvas: Canvas) {

        var startY = 500F
        var startX = 240F
        var stopY = 550f
        var stopX = 180f


        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event == null) {
            return false
        }

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                currentBodyParts++;
                invalidate()

            }
        }
        return true

    }
}
