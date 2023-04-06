package com.example.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val processar: Button = findViewById<Button>(R.id.Processar)
        processar.setOnClickListener {
            val toast = Toast.makeText(this, "O resultado!", Toast.LENGTH_SHORT).show()
            processa()
        }

    }

    private fun processa(){
        val tipo: String = findViewById<EditText>(R.id.Tipo).text.toString()

        val tipoSangue = when (tipo.toLowerCase()) {
            "a+" -> 1
            "a-" -> 2
            "b+" -> 3
            "b-" -> 4
            "ab+" -> 5
            "ab-" -> 6
            "o+" -> 7
            "o-" -> 8
            else -> 0
        }

        if (tipoSangue == 1){                           // sangue do tipo A+
            val textView1 = findViewById<TextView>(R.id.Recebe2)
                textView1.text = "A+,A-,O+,O-"
            val textView2 = findViewById<TextView>(R.id.Doa2)
                textView2.text = "A+,AB+"
        } else if (tipoSangue == 2){                           // sangue do tipo A-
            val textView1 = findViewById<TextView>(R.id.Recebe2)
                textView1.text = "A-,O-"
            val textView2 = findViewById<TextView>(R.id.Doa2)
                textView2.text = "A+,A-,AB+,AB-"
        } else if (tipoSangue == 3){                           // sangue do tipo B+
            val textView1 = findViewById<TextView>(R.id.Recebe2)
            textView1.text = "B+,B-,O+,O-"
            val textView2 = findViewById<TextView>(R.id.Doa2)
            textView2.text = "B+,AB+"
        } else if (tipoSangue == 4){                           // sangue do tipo B-
            val textView1 = findViewById<TextView>(R.id.Recebe2)
            textView1.text = "B-,O-"
            val textView2 = findViewById<TextView>(R.id.Doa2)
            textView2.text = "B+,B-,AB+,AB-"
        } else if (tipoSangue == 5){                           // sangue do tipo AB+
            val textView1 = findViewById<TextView>(R.id.Recebe2)
            textView1.text = "A+,A-,B+,B-,AB+,AB-,O+,O-"
            val textView2 = findViewById<TextView>(R.id.Doa2)
            textView2.text = "AB+"
        } else if (tipoSangue == 6){                           // sangue do tipo AB-
            val textView1 = findViewById<TextView>(R.id.Recebe2)
            textView1.text = "A-,B-AB-,O-"
            val textView2 = findViewById<TextView>(R.id.Doa2)
            textView2.text = "AB+,AB-"
        } else if (tipoSangue == 7){                           // sangue do tipo O+
            val textView1 = findViewById<TextView>(R.id.Recebe2)
            textView1.text = "O+,O-"
            val textView2 = findViewById<TextView>(R.id.Doa2)
            textView2.text = "A+,B+,AB+,O+"
        } else if (tipoSangue == 8){                           // sangue do tipo O-
            val textView1 = findViewById<TextView>(R.id.Recebe2)
            textView1.text = "O-"
            val textView2 = findViewById<TextView>(R.id.Doa2)
            textView2.text = "A+,A-,B+,B-,AB+,AB-,O+,O-"
        } else{
            val toast = Toast.makeText(this, "Tipo sanguineo não existente!", Toast.LENGTH_SHORT).show()
        }
    }


}