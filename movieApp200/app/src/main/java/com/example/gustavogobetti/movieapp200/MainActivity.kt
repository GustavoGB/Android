package com.example.gustavogobetti.movieapp200

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

import java.util.Scanner

class MainActivity : AppCompatActivity() {

    private var mSpinneer: Spinner? = null
    private var mImage: ImageView? = null
    private var mText: TextView? = null
    private var mScrollView: ScrollView? = null
    private val mSelectedText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSpinneer = findViewById(R.id.spinnerOn)
        mImage = findViewById(R.id.moviesImage)
        mText = findViewById(R.id.msg)
        mScrollView = findViewById(R.id.detailScroll)

        mSpinneer!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                Toast.makeText(parent.context, "changed", Toast.LENGTH_SHORT).show()
                val moviesValues = resources.getStringArray(R.array.movies)
                updateTheView(moviesValues[position])
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }
    private fun updateTheView(name: String) {
        try {
            if (!name.isEmpty()) {
                mScrollView!!.visibility = View.VISIBLE
                val idDrawable = resources.getIdentifier(name, "drawable", packageName)
                val idRaw = resources.getIdentifier(name, "raw", packageName)
                val `in` = Scanner(resources.openRawResource(idRaw))
                val build = StringBuilder()
                while (`in`.hasNext()) {
                    build.append(`in`.nextLine())
                }
                this.mText!!.text = build.toString()
                this.mImage!!.setImageResource(idDrawable)
            } else {
                mScrollView!!.visibility = View.GONE
            }
        } catch (exception: Exception) {
            Toast.makeText(this, "some error for $name", Toast.LENGTH_SHORT)
        }

    }
    companion object {
        private val TAG = "MainActivity"
    }
}

