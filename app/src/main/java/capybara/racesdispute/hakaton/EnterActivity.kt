package capybara.racesdispute.hakaton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.lifecycleScope
import capybara.racesdispute.hakaton.server.AccountsRepository
import kotlinx.coroutines.launch

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
    }
    fun load() {
        lifecycleScope.launch {
            val Username = email.text.toString()
            val Password = password.text.toString()
            val ac = AccountsRepository()
            val token = ac.login(Username, Password)
            Log.d("token", token.toString())
        }
    }
}