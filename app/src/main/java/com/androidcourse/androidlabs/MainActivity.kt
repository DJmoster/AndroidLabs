package com.androidcourse.androidlabs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidcourse.androidlabs.models.Figure
import com.androidcourse.androidlabs.models.Line
import com.androidcourse.androidlabs.models.Oval
import com.androidcourse.androidlabs.models.Rectangle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val figuresList = listOf(
            Figure(2.4, 3.4),
            Figure(10.9, 5.2),
            Figure(3.5, 3.5)
        )

        var sum = 0.0

        figuresList.forEach() {
            sum += it.area
        }

        println("Sum of figures: $sum")

        val shapesList = listOf(
            Oval(),
            Oval(),
            Line(),
            Line(),
            Line(),
            Rectangle()
        )

        var ovals = 0
        var lines = 0
        var rectangles = 0

        shapesList.forEach {
            when (it) {
                is Oval -> ovals++
                is Line -> lines++
                is Rectangle -> rectangles++
            }
        }

        println("Ovals $ovals, Lines: $lines, Rectangles: $rectangles")

        ovals = shapesList.filterIsInstance<Oval>().size
        lines = shapesList.filterIsInstance<Line>().size
        rectangles = shapesList.filterIsInstance<Rectangle>().size

        println("Ovals $ovals, Lines: $lines, Rectangles: $rectangles")

    }
}