package com.msamil.msamilrectangulartank.method

import android.content.Context
import android.widget.EditText
import android.widget.Toast

class Methodie() {


    fun area(a:EditText,b:EditText,c:EditText,rv:EditText,context: Context){
        var sonuc = 0f

        if (!a.text.isNullOrEmpty() && !b.text.isNullOrEmpty() && !c.text.isNullOrEmpty()){
            var A = a.text.toString().toFloat()
            var B = b.text.toString().toFloat()
            var C = c.text.toString().toFloat()
             sonuc = 2 * ((A * B)+(B * C)+(A * C))
            rv.setText("Area : $sonuc  cm²")
        }else{
            Toast.makeText(context,"Please Write A Correct Number",Toast.LENGTH_SHORT).show()
            rv.setText("Area : $sonuc  cm²")
        }
    }


    fun volume (a:EditText,b:EditText,c:EditText,rv:EditText,context: Context){
        var sonuc = 0f
        if (!a.text.isNullOrEmpty() && !b.text.isNullOrEmpty() && !c.text.isNullOrEmpty()) {
            var A = a.text.toString().toFloat()
            var B = b.text.toString().toFloat()
            var C = c.text.toString().toFloat()
            sonuc = A * B * C
            rv.setText("Result : $sonuc cm³")
        }else{
            Toast.makeText(context,"Please Write A Correct Number",Toast.LENGTH_SHORT).show()
            rv.setText("Result : $sonuc cm³")
        }
    }
}