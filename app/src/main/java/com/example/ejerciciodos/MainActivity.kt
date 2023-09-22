package com.example.ejerciciodos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    // Declaración de variables
    private lateinit var etRespuesta1: EditText
    private lateinit var rgPregunta1: RadioGroup
    private lateinit var rbVip: RadioButton
    private lateinit var rbPalco: RadioButton
    private lateinit var rbPreferente: RadioButton
    private lateinit var rbGeneral: RadioButton
    private lateinit var btnAceptar: Button
    private lateinit var tvMensaje1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicialización de variables
        etRespuesta1 = findViewById(R.id.etRespuesta1)
        rgPregunta1 = findViewById(R.id.rgPregunta1)
        rbVip = findViewById(R.id.rbVip)
        rbPalco = findViewById(R.id.rbPalco)
        rbPreferente = findViewById(R.id.rbPreferente)
        rbGeneral = findViewById(R.id.rbGeneral)
        btnAceptar = findViewById(R.id.btnAceptar)
        tvMensaje1 = findViewById(R.id.tvMensaje1)

        // Evento click del botón
        btnAceptar.setOnClickListener {
            // Llamada a la función
            if (etRespuesta1.text.isEmpty()) {
                tvMensaje1.text = "Debes de escribir un numero entero"
            } else if(etRespuesta1.text.toString().toInt() == 0){
                tvMensaje1.text = "No puedes comprar 0 boletos 🥺"
            }
            else {
                //declaramos varuiabvles locales para obtener losvalores de las cajas de texto
                var num1: Int = etRespuesta1.text.toString().toInt()

                // Verificamos cual radio button está seleccionado
                if (rbVip.isChecked) {
                    var resultado1: Int = num1 * 900
                    tvMensaje1.text = "El costo de los boletos es de $ $resultado1"
                } else if (rbPalco.isChecked) {
                    var resultado2: Int = num1 * 600
                    tvMensaje1.text = "El costo de los boletos es de $ $resultado2"
                } else if (rbPreferente.isChecked) {
                    var resultado3: Int = num1 * 400
                    tvMensaje1.text = "El costo de los boletos es de $ $resultado3"
                } else if (rbGeneral.isChecked) {
                    var resultado4: Int = num1 * 200
                    tvMensaje1.text = "El costo de los boletos es de $ $resultado4"
                } else {
                    tvMensaje1.text = "Ninguna respuesta seleccionada"
                }
            }
        }
    }
}