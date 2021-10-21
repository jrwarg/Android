package com.example.apptesteupgrade

import android.icu.text.UFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        // ** TIPOS DE DADOS ** //
        // Scopo - Números Inteiros Positivos
        // Byte(byte), Short(short), Int(int), Long, Float, Double
        //UByte, UShort, UInt, ULong

        // range Short: -32768 ~ 32767
        // range Ushort: 65535 ( 64Kbyte)

        val aByte: Byte = -127
        val aUByte: UByte = 127u
        val bUByte: UByte = 128u
        val cUByte: UByte = 128u

        // "Forçar" o resultado para Byte (porque aqui resultaria UInt)
        // val somaUByte: UByte = (aUByte + bUByte).toUByte()
        val somaUByte = (aUByte + bUByte + cUByte)
        Log.i("AppTiposDeDados", "$somaUByte")

        val aUShort: UShort = 6000u
        val bUShort: UShort = 60000u

        val somaUShort: UShort = (aUShort+bUShort).toUShort()
        // aceita porque o resultado será UInt
        // Porém, se especificarmos o tipo na variável soma, haverá erro, porque ultrapassa o range UShort
        Log.i("AppTiposDeDados", "$somaUShort")
        // O resultado de somaUShort seria 464 = dif. entre 66000 - 65535(máx. range do tipo). CUIDADO!!
        */

        // EXERCÍCIOS DA AULA//
        val valorA: Byte = 50
        var valorB: Short = -30
        val valorC: Int = 50
        var valorD: Long = 50
        val valorE: Float = 30f
        var valorF: Double = 50.0
        val valorG: UByte = 30u
        var valorH: UShort = 50u
        val valorI: UInt = 30u
        var valorJ: ULong = 50u
        val valorK: Float = 30f
        val valorL: Double = 50.0

    }
}