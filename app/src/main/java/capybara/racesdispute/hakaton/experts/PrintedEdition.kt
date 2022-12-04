package capybara.racesdispute.hakaton.experts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import capybara.racesdispute.hakaton.R

class PrintedEdition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_printed_edition)
    }

    fun Back(view: View) {
        val intent = Intent(this@PrintedEdition, LowerActivity::class.java)
        startActivity(intent)
    }

    fun save_request_button_clicked(view: View) {
        val intent = Intent(this@PrintedEdition, Lower2Activity::class.java)
        startActivity(intent)
    }

    fun cancel_button_clicked(view: View) {
        val intent = Intent(this@PrintedEdition, LowerActivity::class.java)
        startActivity(intent)
    }
}