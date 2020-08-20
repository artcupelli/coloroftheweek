package com.example.coloroftheweek

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_random_color.setOnClickListener {
            var color = randomColor()
            ctly_main.setBackgroundColor(Color.parseColor(color))
            btn_random_color.text = color
            txv_color.text = color
        }
    }

    fun randomColor(): String {
        var color ="#"
        var hex = arrayOf('0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F')

        for(j in 0..5){
            color += hex[Random.nextInt(0,15)]
        }
        return color
    }
}
