package com.example.nidhi.ekatrit

import android.app.ActionBar
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val decorView: View = window.decorView
        supportActionBar?.hide();
        if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        } else {
            val decorView = window.decorView
            val uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN
            decorView.systemUiVisibility = uiOptions
            val actionBar: ActionBar? = actionBar
            if (actionBar != null) {
                actionBar.hide()
            }
        }
    }

    fun nextactivity(view: View) {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
    }
}