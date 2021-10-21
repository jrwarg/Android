package foo.exercicio.appconstantesvariaveis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * Exercício para declaração de variáveis e
         * utilização do LogCat
         */

        val profissao: String = "Estudante"
        val cidadeNatal: String = "São Paulo"
        val primeiroNome: String = "Fulano"
        val nomeCompleto: String = "Fulano de Tal"
        val enderecoDeEmail: String = "email@email.com"
        val precoDeVenda: Double = 127.99
        val nomeDoProduto: String = "Produto1"

        var altura = 1.78
        var peso = 88
        var fabricante = "Incol"
        var codigoDeBarras = "123777388444"
        var enderecoDeSite = "https://endereco.com.br"
        var descricaoCompleta = "Produto descartável para lavanderias"
        var dataHora = "01/01/2021 23:00:34"

        Log.i("Desafio", "Profissão: $profissao")
        Log.i("Desafio", "Cidade Natal: $cidadeNatal")
        Log.i("Desafio", "Código de Barras: $codigoDeBarras")
        Log.i("Desafio", "Nome do Produto: $nomeDoProduto")

        Log.e("Desafio", "Fabricante: $fabricante")
        Log.e("Desafio", "Data e Hora: $dataHora")



    }
}