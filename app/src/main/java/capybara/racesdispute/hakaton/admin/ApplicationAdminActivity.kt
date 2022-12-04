package capybara.racesdispute.hakaton.admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import capybara.racesdispute.hakaton.experts.ExpertsActivityTrue
import capybara.racesdispute.hakaton.R

class ApplicationAdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application_admin)
    }
    fun go_to_MainActivity(view: View) {
        val intent = Intent(this@ApplicationAdminActivity, ExpertsActivityTrue::class.java)
        startActivity(intent)
    }

    fun go_to_setting_admin(view: View) {
        val intent = Intent(this@ApplicationAdminActivity,Setting_admin::class.java)
        startActivity(intent)
    }

    fun go_to_request_button(view: View) {
        val intent = Intent(this@ApplicationAdminActivity,See_request::class.java)
        startActivity(intent)
    }
}
