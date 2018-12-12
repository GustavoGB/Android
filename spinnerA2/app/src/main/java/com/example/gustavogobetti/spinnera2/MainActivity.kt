package com.example.gustavogobetti.spinnera2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    internal lateinit var sp : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sp = findViewById(R.id.spinnerON) as Spinner
        val movies = arrayOf("Catch me if you can","Fight Club"
            ,"Forrest Gump" , "Good Will Hunting","Pulp Fiction","The GodFather",
            "The Hangover", "The Shaw Shank Redemption",
            "Titanic")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,movies)
        sp.adapter = adapter


    fun Spinner.setOnItemSelectedListener(listener: AdapterView.OnItemSelectedListener){
        onItemSelectedListener = listener
    }

//    sp.setOnItemSelectedListener = object :AdapterView.OnItemSelectedListener {
//        override fun onItemSelected(parent : AdapterView<*>?, view: View?, position: Int, id: Long){
//
//        }
//
//        override fun onNothingSelected(parent: AdapterView<*>?){
//
//        }
//    }

}
}
