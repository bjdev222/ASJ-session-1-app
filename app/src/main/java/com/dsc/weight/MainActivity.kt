package com.dsc.weight

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        go.setOnClickListener {

//            Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show()


            var y=input.text.toString().toFloat()

            var intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("weight",y)
            startActivity(intent)

        }

    }
}