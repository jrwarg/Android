package com.example.appminhaidade.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.appminhaidade.R
import com.example.appminhaidade.controller.PessoaController
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
    lateinit var objetoPessoa: Pessoa
    lateinit var pessoaController: PessoaController

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

        objetoPessoa = Pessoa() // => Isto é um CONSTRUTOR padrão!!

        pessoaController = PessoaController(objetoPessoa)

        // setando a saída do texto de resultado

        textView_result.setText("")
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
            textView_result.setText("")
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
                // montar textView:
                val firstName = editText_TextPersonName.text

                objetoPessoa.firstName =
                    firstName.toString() // firstName está setado como String na Classe Pessoa...
                objetoPessoa.birthYear = birthYear.toInt()

                val currentYear = LocalDate.now().year

                if (birthYear >= currentYear) {
                    editText_birthYear.setError("Ano informado é inválido!")
                    editText_birthYear.requestFocus()
                } else {

                    val ageCalc = pessoaController.calculateAgeYears()

                    textView_result.setText("${pessoaController.pessoa.firstName}, você tem ${pessoaController.calculateAgeYears()} de idade!")

                }
            }
        }
    }
}