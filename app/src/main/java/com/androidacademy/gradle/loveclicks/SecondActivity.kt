package com.androidacademy.gradle.loveclicks

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {

        fun start(context: Context, counter: Int) {
            val openSecondActivity = Intent(context, SecondActivity::class.java)
            openSecondActivity.putExtra(MainActivity.COUNTER_CURRENT_SCORE, counter)
            context.startActivity(openSecondActivity)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val counterScore = intent.getIntExtra(MainActivity.COUNTER_CURRENT_SCORE, -1)
        if (counterScore != -1) {
            Toast.makeText(this, "Got the counter successfully!", Toast.LENGTH_LONG).show()
            asTextView.text = counterScore.toString()
        }
    }
}
