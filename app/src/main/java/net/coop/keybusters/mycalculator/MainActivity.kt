package net.coop.keybusters.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity(),View.OnClickListener  {

    var buttons: Array<Button>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main)

        buttons = arrayOfNulls(size = 10)

        for (i in 0 until buttons.length) {
            run {
                val buttonID = "button" + (i + 1)

                val resID = resources.getIdentifier(buttonID, "id", packageName)
                buttons[i] = findViewById<View>(resID) as Button
                buttons[i].setOnClickListener(this)
            }
        }

    }


    override fun onClick(v: View) {
        // TODO Auto-generated method stub

        var index = 0
        for (i in 0 until buttons.length) {
            if (buttons[i].id === v.id) {
                index = i
                break
            }
        }

        Toast.makeText(this, "Button clicked index => " + index, Toast.LENGTH_SHORT).show()
    }
}
