package com.example.appminhaidade.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.appminhaidade.R


// OBSERVAÇÃO IMPORTANTE:
// Para a tela splash aparecer, é necessário editar o AndroidManifest.xml - conforme feito

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activy_splash)

        Handler(Looper.myLooper()!!).postDelayed({
            val telaPrincipal = Intent(this, MainActivity::class.java)
            // troca de tela
            startActivity(telaPrincipal)
            // para não voltar
            finish()
        }, 4000)
    }
}

