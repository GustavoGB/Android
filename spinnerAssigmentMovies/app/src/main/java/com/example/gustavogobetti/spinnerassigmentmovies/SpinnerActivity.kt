package com.example.gustavogobetti.spinnerassigmentmovies


 import android.os.Bundle
 import android.support.v7.app.AppCompatActivity
 import android.view.View
 import android.widget.AdapterView
 import android.widget.ArrayAdapter
 import android.widget.Spinner
 import android.widget.TextView
 import kotlinx.android.synthetic.main.activity_main.view.*


class SpinnerActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result: TextView


    override fun onCreate(savedInstaceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        option = findViewById(R.id.spOption) as Spinner
        result = findViewById(R.id.tvMovie)  as TextView

        var options = arrayOf()["Option 1","Option 2","Option 3"]

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)


        option.OnItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               result.text = "Please Select an Movie!"
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                result.text = options.get()
            }

        }

    }





}

private var Spinner.OnItemSelectedListener: AdapterView.OnItemSelectedListener






















