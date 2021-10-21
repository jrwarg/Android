package foo.apptelasplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.myLooper()!!).postDelayed({
            // TODO: Esperar até trocar de tela?
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            /**
             * Este método finaliza a aplicação
             */
            startActivity(intent)

            finish()

        }, 10000)
    }
}

private fun Handler.postDelayed() {
    TODO("Not yet implemented")
}

