package com.example.firstdemoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

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



        val btndown = findViewById<Button>(R.id.btndownload)
        val btnupload = findViewById<Button>(R.id.btnupload)
        val layout = findViewById<LinearLayout>(R.id.main)
        val btnclickme = findViewById<Button>(R.id.btnclickme)

        btnupload.setOnClickListener{
            Toast.makeText(applicationContext , "Uploading....." , Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.black)
        }

        btndown.setOnClickListener{
            Toast.makeText(applicationContext , "Downloading....." , Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.yellow)
        }
        btnclickme.setOnClickListener{
            intent = Intent(applicationContext , secondActivity::class.java)
            startActivity(intent)
        }


    }
}