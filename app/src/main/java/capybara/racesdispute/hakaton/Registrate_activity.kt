package capybara.racesdispute.hakaton

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.lifecycleScope
import capybara.racesdispute.hakaton.server.AccountsRepository
import kotlinx.coroutines.launch

lateinit var email1 :AppCompatEditText
lateinit var password1 : AppCompatEditText
lateinit var rePassword : AppCompatEditText
lateinit var  ProblemTxt : TextView

class Registrate_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrate)
        email1 = findViewById(R.id.email)
        password1 = findViewById(R.id.Password)
        rePassword = findViewById(R.id.RePassword)
    }

    fun Continue(view: View) {
        load()

    }
    fun load() {
        lifecycleScope.launch {
            val Username = email1.text.toString()
            val Password = password1.text.toString()
            val RePassword = rePassword.text.toString()
            val ac = AccountsRepository()
            val response = ac.getUser(Username)



        }
    }
    fun BackToRegistrate(view: View) {
        val intent = Intent(this@Registrate_activity,MainActivity::class.java)
        startActivity(intent)
    }
}