package com.example.restrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCalcular: Button =findViewById(R.id.btnCalcular)
        botonCalcular.setOnClickListener {realizarcalculo()}

    }

    private fun realizarcalculo() {

        val campoNombre: EditText = findViewById(R.id.etiNombretxt)
        val nombreusuario:String = campoNombre.text.toString()

        val radio1:RadioButton =findViewById(R.id.etiradio1)
        val radio2:RadioButton =findViewById(R.id.etiradio2)

                var selradio1: String = ""
                var selradio2:String = ""
                if (radio1.isChecked){
                    selradio1 += "selecciono radio 1 "
                }else{
                    selradio1 += "no selecciono radio 1 "
                }

                if(radio2.isChecked) {
                    selradio2 += "selecciono radio 2 "
                }else{
                    selradio2 += "no selecciono radio 2 "
                }

        val check1:CheckBox =findViewById(R.id.eticheck1)
        val check2:CheckBox =findViewById(R.id.eticheck2)

                var selcheck1: String = ""
                var selcheck2: String = ""
                if (check1.isChecked){
                    selcheck1 += "selecciono checkbox 1 "
                }else{
                    selcheck1 += "no selecciono checkbox 1 "
                }
                if (check2.isChecked) {
                    selcheck2 += "selecciono checkbox 2"
                }else{
                    selcheck2 += "no selecciono checkbox 2 "
                }

        val toggle:ToggleButton= findViewById(R.id.btntoogle)
                var selbtntoggle:String = ""
                if (toggle.isChecked) {
                    selbtntoggle += "el Toogle positivo"
                } else {
                    selbtntoggle += "el Toogle negativo"
                }

        val switch:Switch = findViewById(R.id.btnswitch)
                var selswitch:String = ""
                if (switch.isChecked) {
                    selswitch += "Switch si"
                } else {
                    selswitch += "Switch no"
                }

        val selectedOption = "$nombreusuario, $selradio1, $selradio2, $selcheck1, $selcheck2, $selbtntoggle, $selswitch"

        Toast.makeText(this, selectedOption , Toast.LENGTH_LONG).show()

    }
}


