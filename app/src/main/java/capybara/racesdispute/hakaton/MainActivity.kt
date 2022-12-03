package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import capybara.racesdispute.hakaton.R.id.signin_button

class MainActivity : AppCompatActivity() {

    private lateinit var sign_in_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sign_in_button = findViewById(R.id.signin_button)
    }

    fun signin_button_clicked(view: View) {
        val intent = Intent(this@MainActivity,EnterActivity::class.java)
        startActivity(intent)
    }

    fun Registrate(view: View) {
        val intent = Intent(this@MainActivity,Registrate_activity::class.java)
        startActivity(intent)
    }


}