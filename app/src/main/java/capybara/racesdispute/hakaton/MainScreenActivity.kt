package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }

    fun Submit_request_clicked(view: View) {
        val intent = Intent(this@MainScreenActivity,Submit_application_delete::class.java)
        startActivity(intent)
    }
}