package com.example.ecommerceapplication.activity

import android.content.Intent
import android.os.Bundle
import com.example.ecommerceapplication.databinding.ActivityIntroBinding

class IntroActivity : BaseActivity() {
    lateinit var binding:ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startBtn.setOnClickListener {
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
        }

    }
}