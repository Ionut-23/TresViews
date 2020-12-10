package com.example.tresviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.tresviews.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // View Binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.text.setBackgroundColor(Color.GREEN)
            binding.edit.setBackgroundColor(Color.BLUE)
        }

        // findViewById
        val edittext= findViewById<EditText>(R.id.edit)
        val botoncito = findViewById<Button>(R.id.button)
        val texto = findViewById<TextView>(R.id.text)

        /* ViewHolder o sinteticos,
        Perdona Carlos este como que no lo entiendo muy bien.
          */
        text.setText("Hola que tal?")

    }
}