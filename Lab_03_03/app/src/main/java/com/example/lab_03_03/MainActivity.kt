package com.example.lab_03_03

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.ten -> testWord.setTextSize(10F)
            R.id.sixteen -> testWord.setTextSize(16F)
            R.id.twenty -> testWord.setTextSize(20F)
            R.id.red -> testWord.setTextColor(Color.RED)
            R.id.black -> testWord.setTextColor(Color.BLACK)
            R.id.normalMenu ->Toast.makeText(this,"这是一个普通的菜单项",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}