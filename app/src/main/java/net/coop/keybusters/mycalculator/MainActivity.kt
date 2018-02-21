package net.coop.keybusters.mycalculator

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity()  {
    private val TAG = "calc"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)
    }

    // android:onClick="buttonHandler" in XML design file
    fun buttonHandler(v: View) {
        val i = v.id
        showToastMessage("hello + $i",this)

    }


    fun showToastMessage(value: String, context: Context) {
        Toast.makeText(applicationContext, value, Toast.LENGTH_SHORT).show()
    }




}//END MainActivity
