package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import capybara.racesdispute.hakaton.admin.ApplicationAdminActivity
import capybara.racesdispute.hakaton.experts.ExpertsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun signin_button_clicked(view: View) {
        val intent = Intent(this@MainActivity,EnterActivity::class.java)
        startActivity(intent)
    }

    fun Registrate(view: View) {
        val intent = Intent(this@MainActivity,ApplicationAdminActivity::class.java)
        startActivity(intent)
    }}