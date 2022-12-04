package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.lifecycleScope
import capybara.racesdispute.hakaton.server.AccountsRepository
import kotlinx.coroutines.launch
import java.io.File

lateinit var email : AppCompatEditText
lateinit var password : AppCompatEditText

class EnterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)
        email = findViewById(R.id.EdTxtMail)
        password = findViewById(R.id.EdTxtPassword)

    }

    fun Login(view: View) {
        load()
        val intent = Intent(this@EnterActivity,MainScreenActivity::class.java)
        startActivity(intent)
    }
    fun load() {
        lifecycleScope.launch {
            val Username = email.text.toString()
            val Password = password.text.toString()

                val ac = AccountsRepository()
                val token = ac.login(Username, Password)


        }
    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@EnterActivity,MainActivity::class.java)
        startActivity(intent)
    }
}