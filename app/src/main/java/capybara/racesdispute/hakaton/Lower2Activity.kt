package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import capybara.racesdispute.hakaton.experts.ExpertsActivityTrue

class Lower2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lower2)
    }

    fun save_request_button_clicked(view: View) {
        val intent = Intent(this@Lower2Activity,ExpertsActivityTrue::class.java)
        startActivity(intent)
    }

    fun cancel_button_clicked(view: View) {
        val intent = Intent(this@Lower2Activity,LowerActivity::class.java)
        startActivity(intent)
    }

    fun BackToSubmitApplicationDelete_Button(view: View) {
        val intent = Intent(this@Lower2Activity,LowerActivity::class.java)
        startActivity(intent)
    }
}