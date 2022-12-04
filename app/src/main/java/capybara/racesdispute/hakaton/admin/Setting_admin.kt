package capybara.racesdispute.hakaton.admin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import capybara.racesdispute.hakaton.R

class Setting_admin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_admin)

    }

    fun go_to_request_button(view: View) {
        val intent = Intent(this@Setting_admin,See_request::class.java)
        startActivity(intent)
    }
}