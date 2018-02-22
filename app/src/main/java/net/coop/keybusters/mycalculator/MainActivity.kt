package net.coop.keybusters.mycalculator

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity()  {
    var utils = Utils()
    lateinit var cal: Calculator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)
        cal = Calculator (this)

    }

    // android:onClick="buttonHandler" in XML design file
    fun buttonHandler(v: View) {
        val resourceName:String = v.getResources().getResourceEntryName(v.getId())
        cal.processButtonClick(resourceName)
        utils.showToast("Testing MainActivity",this)

    }


//    fun showToastMessage(value: String, context: Context) {
//        Toast.makeText(applicationContext, value, Toast.LENGTH_SHORT).show()
//    }




}//END MainActivity
