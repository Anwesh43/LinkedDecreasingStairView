package com.anwesh.uiprojects.linkeddecreasingstairview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.decreasingstairview.DecreasingStairView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DecreasingStairView.create(this)
    }
}
