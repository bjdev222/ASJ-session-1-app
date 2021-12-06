package com.dsc.weight

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var weight=intent.getFloatExtra("weight",0F)

//        Toast.makeText(this,weight.toString(),Toast.LENGTH_SHORT).show()


        p1.setOnClickListener {

            var pweight=weight*2.34

            Toast.makeText(this,pweight.toString(),Toast.LENGTH_LONG).show()


        }

        p2.setOnClickListener {

            var pweight=weight*	0.166

            Toast.makeText(this,pweight.toString(),Toast.LENGTH_LONG).show()


        }

        p3.setOnClickListener {

            var pweight=weight*0.38

            Toast.makeText(this,pweight.toString(),Toast.LENGTH_LONG).show()


        }

        p4.setOnClickListener {

            var pweight=weight*	0.38

            Toast.makeText(this,pweight.toString(),Toast.LENGTH_LONG).show()


        }

    }
}