package com.example.inplicitintentreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.inplicitintentreceiver.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val intent = getIntent()
        val uri = intent.getData()

        if (uri != null) {
            val uri_string = "URI: $uri"
            binding.textUriMessage.text = uri_string
        }
    }
}