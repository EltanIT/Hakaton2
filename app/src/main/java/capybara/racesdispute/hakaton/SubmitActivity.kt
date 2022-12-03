package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SubmitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)
    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@SubmitActivity,MainScreenActivity::class.java)
        startActivity(intent)
    }

    fun Continue(view: View) {
        val intent = Intent(this@SubmitActivity,Submit_application_delete::class.java)
        startActivity(intent)
    }
}