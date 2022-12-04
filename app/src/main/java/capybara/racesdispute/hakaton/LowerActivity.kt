package capybara.racesdispute.hakaton

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import capybara.racesdispute.hakaton.experts.ExpertsActivity

class LowerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lower)

    }

    fun save_request_button_clicked(view: View) {
        val intent = Intent(this@LowerActivity,PrintedEdition::class.java)
        startActivity(intent)
    }

    fun Back(view: View) {
        val intent = Intent(this@LowerActivity,ExpertsActivity::class.java)
        startActivity(intent)
    }

    fun cancel_button_clicked(view: View) {
        val intent = Intent(this@LowerActivity,ExpertsActivity::class.java)
        startActivity(intent)
    }
}