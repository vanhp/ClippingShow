package com.vanh.clippingshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vanh.clippingshow.UI.ClippedView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ClippedView(this))
    }
}