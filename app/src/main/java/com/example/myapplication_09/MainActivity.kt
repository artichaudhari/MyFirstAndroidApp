package com.example.myapplication_09

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun sendNow(view: View) {
        Toast.makeText(this, "Sending data from app...", Toast.LENGTH_SHORT).show()
    }fun receiveNow(view: View) {
        Toast.makeText(this, "Receiving data from app...", Toast.LENGTH_SHORT).show()
    }fun deleteNow(view: View) {
        Toast.makeText(this, "Deleting data from app...", Toast.LENGTH_SHORT).show()
    }
}
