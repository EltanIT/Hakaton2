package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class See_request_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_see_request)

    }

    fun see_request_button_clicked(view: View) {
        val intent = Intent(this@See_request_Activity,TV::class.java)
        startActivity(intent)
    }

    fun BackToSubmitApplicationDelete_Button(view: View) {
        val intent = Intent(this@See_request_Activity,SubmitActivity::class.java)
        startActivity(intent)
    }

    fun read_more(view: View) {}
}