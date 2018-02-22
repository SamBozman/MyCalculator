package net.coop.keybusters.mycalculator
import android.content.Context
import android.widget.Toast

/**
 * Created by SamB64 on 2/20/2018.
 */
class Calculator(val context: Context) {
    var utils = Utils()
    fun processButtonClick(resourceName:String){

        var rName = resourceName
        utils.showToast("$resourceName",context.applicationContext)
    }















}//END Calculator class




