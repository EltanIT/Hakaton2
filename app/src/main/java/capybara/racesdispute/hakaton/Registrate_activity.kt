package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Registrate_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrate)
    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@Registrate_activity,MainActivity::class.java)
        startActivity(intent)
    }

    fun Continue(view: View) {
        val intent = Intent(this@Registrate_activity,MainScreenActivity::class.java)
        startActivity(intent)
    }
}