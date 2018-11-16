package com.example.justintey.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox_1.setOnClickListener({
            if(checkbox_1.isChecked)
            {
                checkbox_2.visibility = View.VISIBLE
                checkbox_3.visibility = View.VISIBLE
            }
            else
            {
                checkbox_2.visibility = View.GONE
                checkbox_3.visibility = View.GONE
            }

        })


    }

    fun validate()
    {
        if(name_input.text.isEmpty())
            name_input.setError("Field empty")

        if(desc_input.text.isEmpty())
            desc_input.setError("Field empty")

        if(rel_date_input.text.isEmpty())
            rel_date_input.setError("Field empty")
    }

    fun onBtnClicked(v: View)
    {
        validate()
        var id: Int = radio_group.checkedRadioButtonId
        val radio: RadioButton = findViewById(id)
        var movie: String= name_input.text.toString()
        var description: String= desc_input.text.toString()
        var releasedate: String= rel_date_input.text.toString()
        var reason1: String=""
        var reason2: String=""
        var suitable: String=""
        var alledges: String=""
        if(checkbox_1.isChecked){
            alledges = "false"
        }else{
            alledges = "true"
        }


        if(checkbox_2.isChecked==false && checkbox_3.isChecked==false){
            reason1=""
            reason2=""
            suitable=""
        }
        else if(checkbox_2.isChecked==false && checkbox_3.isChecked==true){
            reason1=""
            reason2="Language"
            suitable="Reason:"
        }
        else if(checkbox_2.isChecked==true && checkbox_3.isChecked==false){
            reason1="Violence"
            reason2=""
            suitable="Reason:"
        }
        else if(checkbox_2.isChecked==true && checkbox_3.isChecked==true){
            reason1="Violence"
            reason2="Language"
            suitable="Reason:"
        }
        Toast.makeText(this, "Title=${movie}\n Overview= ${description}\n" +
                "Release date= ${releasedate}\n Language=${radio.text}\n Suitable for all ages = ${alledges}\n ${suitable}\n ${reason1}\n ${reason2}\n ",Toast.LENGTH_SHORT).show()
    }


}
