package capybara.racesdispute.hakaton.experts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import capybara.racesdispute.hakaton.EnterActivity
import capybara.racesdispute.hakaton.R

class ExpertsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experts)
    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@ExpertsActivity,EnterActivity::class.java)
        startActivity(intent)
    }
    fun Continue(view: View) {
        val intent = Intent(this@ExpertsActivity, LowerActivity::class.java)
        startActivity(intent)
    }


}