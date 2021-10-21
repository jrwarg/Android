package com.example.appminhaidade.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.appminhaidade.R
import com.example.appminhaidade.model.Pessoa
import java.time.LocalDate

class MainActivity : AppCompatActivity() {

    // Declaração dos objetos

    lateinit var editText_TextPersonName: EditText
    lateinit var editText_birthYear: EditText
    lateinit var button_novocalc: Button
    lateinit var button_ageCalc: Button
    lateinit var textView_result: TextView
    lateinit var button_exit: Button
    lateinit var pessoa: Pessoa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obrigatório: Inicializar os objetos

        initComponents()
        initButtonClick()
    }

    private fun initComponents() {
        // Instanciar os objetos
        editText_TextPersonName = findViewById(R.id.editText_TextPersonName)
        editText_birthYear = findViewById(R.id.editText_birthYear)
        button_novocalc = findViewById(R.id.button_novocalc)
        button_ageCalc = findViewById(R.id.button_ageCalc)
        textView_result = findViewById(R.id.textView_result)
        button_exit = findViewById(R.id.button_exit)

        // setando a saída do texto de resultado

        textView_result.setText("Aplicativo inicializado com sucesso....")
    }

    private fun initButtonClick() {

        button_exit.setOnClickListener {
            Toast.makeText(
                this, "Clicado no botão sair",
                Toast.LENGTH_SHORT
            ).show()

            finish()
        }

        button_novocalc.setOnClickListener {
            editText_TextPersonName.setText("")
            editText_birthYear.setText("")
        }

        button_ageCalc.setOnClickListener {

            var validate = true

            if (editText_TextPersonName.text.isEmpty()) {
                validate = false
                editText_TextPersonName.setError("Campo Nome obrigatório!")
                editText_TextPersonName.requestFocus()
            }
            if (editText_birthYear.text.isEmpty()) {
                validate = false
                editText_birthYear.setError("Campo Ano de Nascimento obrigatório!")
                editText_TextPersonName.requestFocus()
            }

            if (validate) {

                val birthYear = editText_birthYear.text.toString().toInt()
                val currentYear = LocalDate.now().year

                if (birthYear >= currentYear) {
                    editText_birthYear.setError("Ano informado é inválido!")
                    editText_birthYear.requestFocus()
                } else {

                    val ageCalc = currentYear - birthYear

                    // montar textView:
                    val firstName = editText_TextPersonName.text

                    textView_result.setText("$firstName, você tem $ageCalc anos de vida!")
                }
            }
        }
    }
}