package com.example.heybhairav

import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_IMMERSIVE

    }


}