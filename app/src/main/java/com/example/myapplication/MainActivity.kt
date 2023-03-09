package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonComponenetes: Button = findViewById(R.id.button)
        botonComponenetes.setOnClickListener { componenetes() }

    }

    private fun componenetes() {

        val campoNombre: EditText = findViewById(R.id.idNombreText)
        val nombre:String = campoNombre.text.toString()

        var radio1check=""
        var radio2check=""
        var check1check=""
        var check2check=""
        var togglebtncheck=""
        var switchcheck=""

        val radio1: RadioButton = findViewById(R.id.radioButton)
        if (radio1.isChecked) {
            radio1check="El radio 1 esta seleccionado"
        } else {
            radio1check="El radio 1 NO esta seleccionado"
        }

        val radio2: RadioButton = findViewById(R.id.radioButton2)
        if (radio2.isChecked) {
            radio2check="El radio 2 esta seleccionado"
        } else {
            radio2check="El radio 2 NO esta seleccionado"
        }

        val check1: CheckBox = findViewById(R.id.checkBox)
        if (check1.isChecked) {
            check1check="El check 1 esta seleccionado"
        } else {
            check1check="El check 1 NO esta seleccionado"
        }
        val check2: CheckBox = findViewById(R.id.checkBox2)
        if (check2.isChecked) {
            check2check="El check 2 esta seleccionado"
        } else {
            check2check="El check 2 NO esta seleccionado"
        }

        val toggleButton: ToggleButton = findViewById(R.id.toggleButton)
        if (toggleButton.isChecked) {
            togglebtncheck="El toggleButton esta seleccionado"
        } else {
            togglebtncheck="El toggleButton NO esta seleccionado"
        }
        val switch: Switch = findViewById(R.id.switch1)
        if (switch.isChecked) {
            switchcheck="El switch esta seleccionado"
        } else {
            switchcheck="El switch NO esta seleccionado"
        }

        var componentesselects="$nombre \n $radio1check \n $radio2check \n $check1check \n $check2check \n $togglebtncheck \n $switchcheck"

        Toast.makeText(this,componentesselects, Toast.LENGTH_LONG).show()

    }
}