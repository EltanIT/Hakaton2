package capybara.racesdispute.hakaton.admin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import capybara.racesdispute.hakaton.R

class See_request : AppCompatActivity() {

    private lateinit var textviewanim: TextView
    private lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_see_request2)

        textviewanim = findViewById(R.id.textviewanim)
        anim = AnimationUtils.loadAnimation(this,R.anim.set)
    }

    fun go_to_setting_admin(view: View) {
        val intent = Intent(this@See_request, Setting_admin::class.java)
        startActivity(intent)
    }

    fun BacktoApplicationListAdmin(view: View) {
        val intent = Intent(this@See_request,Application_admin::class.java)
        startActivity(intent)
    }

    fun see_request_button_clicked(view: View) {}

    fun read_more(view: View) {
        textviewanim.startAnimation(anim)
    }
}


