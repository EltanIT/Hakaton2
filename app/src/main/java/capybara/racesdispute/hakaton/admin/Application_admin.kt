package capybara.racesdispute.hakaton.admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.RelativeLayout
import capybara.racesdispute.hakaton.MainActivity
import capybara.racesdispute.hakaton.R

class Application_admin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application_admin)

    }

    fun go_to_MainActivity(view: View) {
        val intent = Intent(this@Application_admin,MainActivity::class.java)
        startActivity(intent)
    }

    fun go_to_setting_admin(view: View) {
        val intent = Intent(this@Application_admin,Setting_admin::class.java)
        startActivity(intent)
    }

    fun go_to_request_button(view: View) {
        val intent = Intent(this@Application_admin,See_request::class.java)
        startActivity(intent)
    }
}