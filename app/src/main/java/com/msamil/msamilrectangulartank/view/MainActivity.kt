package com.msamil.msamilrectangulartank.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.msamil.msamilrectangulartank.R
import com.msamil.msamilrectangulartank.method.Methodie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aSideText.requestFocus()

        calculate.setOnClickListener {
            Methodie().area(aSideText,bSideText,cSideText,areaResult,this)
            Methodie().volume(aSideText,bSideText,cSideText,volumeResult,this)
        }

    }
}
