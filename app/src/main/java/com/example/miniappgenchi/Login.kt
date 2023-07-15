package com.example.miniappgenchi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.miniappgenchi.R
import com.example.miniappgenchi.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    private lateinit var userName:String
    private lateinit var password:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setters hehe
        fun setUserName(userName:String){
            this.userName =userName
        }
        fun setPassword(password:String){
            this.password=password
        }
        //getters hehe ilan araw lang nalimutan ko na haha
        fun getUserName():String{
            return userName
        }
        fun getPassword():String{
            return password
        }

        binding.btnLogin.setOnClickListener {

            //default credentials as per requirement
            setUserName("admin")
            setPassword("pass123")

            val userName = binding.etUsername.text.toString()
            val password= binding.etPassword.text.toString()

            if(userName==getUserName() && password==getPassword()){
                var myIntent = Intent(this, MainActivity::class.java)
                startActivity(myIntent)
                finish()
            }else{
                Toast.makeText(applicationContext,"Incorrect username and password.",Toast.LENGTH_SHORT).show()
            }
        }
    }
}