package com.example.gustavogobetti.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    private val TAG = MainActivity::class.qualifiedName


    private val calculator = mCalculator




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
