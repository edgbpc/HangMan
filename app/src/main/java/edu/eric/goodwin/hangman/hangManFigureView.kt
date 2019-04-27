package edu.eric.goodwin.hangman

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class hangManFigureView: View {

    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var colorBorder = Color.BLACK
    private var colorInside = Color.WHITE
    private var size = 180
    private var borderWidth = 4.0f

    override fun onDraw(canvas: Canvas){
        super.onDraw(canvas)

        drawHead(canvas)
        drawBody(canvas)
        drawRightArm(canvas)
        drawLeftArm(canvas)
        drawLeftFoot(canvas)
        drawRightFoot(canvas)

    }

    private fun drawHead(canvas: Canvas){

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        val radius = size/2f

        canvas.drawCircle(size/.75f, size/2f, radius - borderWidth, paint)

    }

    private fun drawBody(canvas: Canvas){
        var startY = 180F
        var startX = 240F
        var stopY = 500F
        var stopX = 240F

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }

    private fun drawRightArm(canvas: Canvas){

        var startY = 280F
        var startX = 240F
        var stopY = 225f
        var stopX = 150f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)
    }

    private fun drawLeftArm(canvas: Canvas){

        var startY = 280F
        var startX = 240F
        var stopY = 225f
        var stopX = 330f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

          canvas.drawLine(startX, startY, stopX, stopY, paint)
    }

    private fun drawLeftFoot(canvas: Canvas){
        var startY = 500F
        var startX = 240F
        var stopY = 550f
        var stopX = 300f

        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }

    private fun drawRightFoot(canvas: Canvas ) {

        var startY = 500F
        var startX = 240F
        var stopY = 550f
        var stopX = 180f


        paint.color = colorBorder
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderWidth

        canvas.drawLine(startX, startY, stopX, stopY, paint)

    }

}