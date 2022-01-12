package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

private lateinit var first_email : EditText
    private lateinit var first_password : EditText
    private lateinit var second_password : EditText
    private lateinit var register_button : Button


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_main)

        init()
        registerListeners()
    }
    private fun init() {
        first_email = findViewById(R.id.first_email)
        first_password = findViewById(R.id.first_password)
        second_password = findViewById(R.id.second_password)
        register_button = findViewById(R.id.button)



    }

    private fun registerListeners(){

        register_button.setOnClickListener {
            val first_email = first_email.text.toString()
            val firs_password = first_password.text.toString()
            val second_password = second_password.text.toString()



            if(first_email.isEmpty() and firs_password.isEmpty() and second_password.isEmpty() ){

                Toast.makeText(this,"Empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

                
                
            }
            if(firs_password != second_password){
                Toast.makeText(this, "Password and Confirm Password do not match", Toast.LENGTH_SHORT).show()


            }

            auth.createUserWithEmailAndPassword(first_email, firs_password).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Successfully Singed Up", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    Toast.makeText(this, "Singed Up Failed!", Toast.LENGTH_SHORT).show()


        }




    }

}