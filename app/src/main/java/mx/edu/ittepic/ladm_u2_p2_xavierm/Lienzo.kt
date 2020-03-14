package mx.edu.ittepic.ladm_u2_p2_xavierm

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    var puntero = p

    //GRANDES
    var circulo = FiguraGeometrica((0..1050).random(), 150, 150)
    var circulo2 = FiguraGeometrica((0..1050).random(), 800, 150)
    var circulo3 = FiguraGeometrica((0..1050).random(), 1600, 150)

    //MEDIANAS
    var circulo4 = FiguraGeometrica((0..1050).random(), 150, 100)
    var circulo5 = FiguraGeometrica((0..1050).random(), 600, 100)
    var circulo6 = FiguraGeometrica((0..1050).random(), 300, 100)

    //PEQUEÑAS
    var circulo7 = FiguraGeometrica((0..1050).random(), 40, 50)
    var circulo8 = FiguraGeometrica((0..1050).random(), 20, 50)
    var circulo9 = FiguraGeometrica((0..1050).random(), 450, 50)

    var punteroFiguraGeometrica: FiguraGeometrica? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.BLACK)

        //Dibujando 1er ciculo
        paint.color = Color.rgb(106,46,134)
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo.pintar(canvas, paint)

        //Dibujando 2do ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(8,42,107)
        circulo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo2.pintar(canvas, paint)

        //Dibujando tercer ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(10,135,79)
        circulo3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo3.pintar(canvas, paint)

        //Dibujando 4TO ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(182,115,53)
        circulo4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo4.pintar(canvas, paint)

        //Dibujando 5TO ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.MAGENTA
        circulo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo5.pintar(canvas, paint)

        //Dibujando 6TO ciculo
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        circulo6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo6.pintar(canvas, paint)

        //Dibujando 7mo circulo
        paint.style = Paint.Style.FILL
        paint.color = Color.CYAN
        circulo7.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo7.pintar(canvas, paint)

        //Dibujando 8Vo circulo
        paint.style = Paint.Style.FILL
        paint.color = Color.YELLOW
        circulo8.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo8.pintar(canvas, paint)

        //Dibujando 9no circulo
        paint.style = Paint.Style.FILL
        paint.color = Color.GRAY
        circulo9.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.WHITE
        paint.strokeWidth = 10f
        circulo9.pintar(canvas, paint)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        //puntero.setTitle("")
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
            }
            MotionEvent.ACTION_MOVE -> {
                if (punteroFiguraGeometrica != null) {
                    punteroFiguraGeometrica!!.arrastrar(event)
                }
            }
            MotionEvent.ACTION_UP -> {
                punteroFiguraGeometrica = null
            }
        }
        invalidate()
        return true
    }

    fun animarCirculo() {
        circulo.rebote(width,height)
        circulo2.rebote(width,height)
        circulo3.rebote(width,height)
        circulo4.rebote(width,height)
        circulo5.rebote(width,height)
        circulo6.rebote(width,height)
        circulo7.rebote(width,height)
        circulo8.rebote(width,height)
        circulo9.rebote(width,height)
        invalidate()
    }
}