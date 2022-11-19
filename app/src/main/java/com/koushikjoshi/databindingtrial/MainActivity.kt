package com.koushikjoshi.databindingtrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.koushikjoshi.databindingtrial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.submitButton.setOnClickListener {

            displayGreetingText()

        }


    }

    private fun displayGreetingText() {

        binding.apply {

            greetingTextView.text = "Hello " + nameEditText.text

        }



    }
}