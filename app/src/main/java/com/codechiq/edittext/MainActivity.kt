package com.codechiq.edittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edittext: EditText
    lateinit var result : TextView
    lateinit var copy : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edittext = findViewById(R.id.et_edittext) as EditText
        result = findViewById(R.id.tv_result) as TextView
        copy = findViewById(R.id.btn_copy) as Button

        copy.setOnClickListener({
            result.text = edittext.text
        })

        edittext.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                result.text = p0
            }

        })
    }
}
