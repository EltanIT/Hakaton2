package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

var token1 : String = ""
class MainScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
       var token = intent.getStringExtra("Authorization")
        token1 = token!!

    }

    fun Submit_request_clicked(view: View) {
        val intent = Intent(this@MainScreenActivity,SubmitActivity::class.java)
        intent.putExtra("Authorization",token1)
        startActivity(intent)
    }
}