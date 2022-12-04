package capybara.racesdispute.hakaton.experts

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import capybara.racesdispute.hakaton.R

class ExpertsActivityTrue : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experts_true)
    }

    fun BackToSubmitApplicationDelete_Button(view: View) {
        val intent = Intent(this@ExpertsActivityTrue, ExpertsActivity::class.java)
        startActivity(intent)
    }

    fun Back(view: View) {
        val intent = Intent(this@ExpertsActivityTrue, ExpertsActivity::class.java)
        startActivity(intent)
    }


}