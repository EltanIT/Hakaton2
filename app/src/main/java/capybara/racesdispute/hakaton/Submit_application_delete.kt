package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Submit_application_delete : AppCompatActivity() {

    private lateinit var see_request_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit_application_delete)
        see_request_button = findViewById(R.id.see_request_button)

    }

    fun see_request_button_clicked(view: View) {
        val intent = Intent(this@Submit_application_delete,See_request_Activity::class.java)
        startActivity(intent)
    }
}