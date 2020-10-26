package com.example.lab_03_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(){
            dialog()
        }
    }

    fun dialog(){
        val dialog =AlertDialog.Builder(this).create()
        val dialogView =View.inflate(this,R.layout.dialog_layout,null)
            dialog.setView(dialogView)
            dialog.show()

        val btn_SignIn = dialogView.findViewById<Button>(R.id.btn_SignIn)
        val btn_Cancel = dialogView.findViewById<Button>(R.id.btn_Cancel)

        btn_SignIn.setOnClickListener(){
            val user_name =dialogView.findViewById<EditText>(R.id.userName)
            val pass_word =dialogView.findViewById<EditText>(R.id.password)
            val username =user_name.text.toString()
            val passwd =pass_word.text.toString()
            if (TextUtils.isEmpty(username)||TextUtils.isEmpty(passwd)){
                Toast.makeText(this,"用户名密码不能为空",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this,"用户名:$username 密码:$passwd",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        btn_Cancel.setOnClickListener(){
            dialog.dismiss()
        }


    }
}