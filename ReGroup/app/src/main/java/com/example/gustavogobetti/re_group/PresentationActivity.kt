package com.example.gustavogobetti.re_group

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class presentationScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.present_page)
    }

    fun signIn(view: View) {
        val intent = Intent(this, loginScreen::class.java)
        startActivity(intent)
    }
}
