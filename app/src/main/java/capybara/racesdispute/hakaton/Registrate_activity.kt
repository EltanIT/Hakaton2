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
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrate)
        email1 = findViewById(R.id.email)
        password1 = findViewById(R.id.Password)
        rePassword = findViewById(R.id.RePassword)
        ProblemTxt = findViewById(R.id.necessarily)
    }

    fun Continue(view: View) {
        load()

    }
    fun load() {
        lifecycleScope.launch {
            val Username = email1.text.toString()
            val Password = password1.text.toString()
            val RePassword = rePassword.text.toString()
            if (Password == RePassword){
                val ac = AccountsRepository()
                val token = ac.registrate(
                    Username, Password)
                Log.d("token", token.toString())
                val intent = Intent(this@Registrate_activity,MainScreenActivity::class.java)
                startActivity(intent)
            }
            else{
                ProblemTxt.setTextColor(getColor(R.color.error))
                ProblemTxt.setText("Введите все данные верно")

            }

        }
    }
    fun BackToRegistrate(view: View) {
        val intent = Intent(this@Registrate_activity,MainActivity::class.java)
        startActivity(intent)
    }
}