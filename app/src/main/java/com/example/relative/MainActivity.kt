package com.example.relative

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.ViewCompat.setBackground
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var loadButton: Button
    private lateinit var bookTextView: TextView
    private lateinit var titleTextView: TextView
    private lateinit var mainlayout : RelativeLayout


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        loadButton = findViewById(R.id.loadButton)
        bookTextView = findViewById(R.id.bookTextView)
        titleTextView = findViewById(R.id.titleTextView)
        mainlayout = findViewById(R.id.main)



        loadButton.setOnClickListener {
            titleTextView.visibility = View.GONE
            mainlayout.setBackgroundResource(R.drawable.master)
            val bookContent = loadBook()
            bookTextView.text = bookContent
            bookTextView.visibility = View.VISIBLE

        }
    }
    private fun loadBook(): String{
        return Database.bookText
    }
}





