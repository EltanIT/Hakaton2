package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var textviewanim: LinearLayout
    private lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textviewanim = findViewById(R.id.linearlayout)
        anim = AnimationUtils.loadAnimation(this,R.anim.set)

    }

    fun signin_button_clicked(view: View) {
        val intent = Intent(this@MainActivity,EnterActivity::class.java)
        startActivity(intent)
    }


    fun Registrate(view: View) {
        val intent = Intent(this@MainActivity, Registrate_activity::class.java)
        startActivity(intent)

    }

}
