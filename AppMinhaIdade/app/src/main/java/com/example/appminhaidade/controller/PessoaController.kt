package com.example.appminhaidade.controller

import com.example.appminhaidade.model.Pessoa
import java.time.LocalDate

class PessoaController(objetoPessoa: Pessoa) {

    var pessoa: Pessoa = objetoPessoa

    fun showResult(): String{
        return "${this.pessoa.firstName}, ${this.pessoa.birthYear}"

    }

    fun calculateAgeYears(currentYear: Int) : Int{
        return currentYear - this.pessoa.birthYear
    }

    fun calculateAgeYears(): Int {
        val currentYear = LocalDate.now().year
        return currentYear - this.pessoa.birthYear
    }


}