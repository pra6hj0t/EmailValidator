package com.example.emailvalidator

import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.emailvalidator.databinding.ActivityMainBinding
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnValidate.setOnClickListener {
            val email = binding.email.text.toString()
            if (email.trim().equals("")){
                Toast.makeText(this,"Enter Email",Toast.LENGTH_SHORT).show()

            }else{
                if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(this,"Valid",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Not Valid",Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}