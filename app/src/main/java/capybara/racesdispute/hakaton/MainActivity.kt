package capybara.racesdispute.hakaton

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import capybara.racesdispute.hakaton.admin.Application_admin
import capybara.racesdispute.hakaton.admin.See_request
import capybara.racesdispute.hakaton.admin.Setting_admin
import capybara.racesdispute.hakaton.experts.ExpertsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun signin_button_clicked(view: View) {
        val intent = Intent(this@MainActivity,EnterActivity::class.java)
        startActivity(intent)
    }

    fun Registrate(view: View) {
        val intent = Intent(this@MainActivity,Registrate_activity::class.java)
        startActivity(intent)
    }

}