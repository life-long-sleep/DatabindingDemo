package com.mad.p3_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mad.p3_quiz.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil as DataBindingUtil1


class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding
    private var aPerson :Person = Person("Sam", "000919-00-0123", "sam@gmail.com", "123, Jalan Apple")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil1.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson

        /*
        binding.nameInput.text = aPerson.name
        binding.icInput.text = aPerson.ic
        binding.emailInput.text = aPerson.email
        binding.addressInput.text = aPerson.address
        */
        
        binding.btnUpdate.setOnClickListener(){

            aPerson.email = "sss@gmail.com"

            binding.apply { invalidateAll() }
        }
    }
}