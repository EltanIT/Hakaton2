package capybara.racesdispute.hakaton.admin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import capybara.racesdispute.hakaton.MainScreenActivity
import capybara.racesdispute.hakaton.R
import capybara.racesdispute.hakaton.Text_animation

class See_request : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_see_request2)
    }

    fun go_to_setting_admin(view: View) {
        val intent = Intent(this@See_request, Setting_admin::class.java)
        startActivity(intent)
    }

    fun BacktoApplicationListAdmin(view: View) {
        val intent = Intent(this@See_request,Application_admin::class.java)
        startActivity(intent)
    }
}


