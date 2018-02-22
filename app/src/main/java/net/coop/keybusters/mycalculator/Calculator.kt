package net.coop.keybusters.mycalculator
import android.content.Context
/**
 * Created by SamB64 on 2/20/2018.
 */
class Calculator(val context: Context) {

    private val calButtons = arrayOf("b0","b1","b2","b3","b4","b5","b6","b7","b8", "b9",
            "formula","result","fraction","difract","numerator",
            "denominator","TBA","power","root","clear",
            "divide","multiply","minus","decimal","equals","plus","help")




    fun processButtonClick(butID: Int): String{
       var result = butID.toString() + "test"

        return  result
    }



}




