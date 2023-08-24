package com.example.latihan_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.latihan_2.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnTest1.setOnClickListener{
                //bagian di bawah ini yang dirubah.
                val name = editTextName.text.toString()
                Toast.makeText(this@MainActivity, "Halo $name!", Toast.LENGTH_LONG).show()
            }
        }
    }
}
