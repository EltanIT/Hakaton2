package capybara.racesdispute.hakaton

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class submit: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.submit)

    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@submit,registration::class.java)
        startActivity(intent)
    }
}