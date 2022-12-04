package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.lifecycleScope
import capybara.racesdispute.hakaton.experts.ExpertsActivityTrue
import capybara.racesdispute.hakaton.server.AccountsRepository
import capybara.racesdispute.hakaton.server.tokenCLass
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
         var token = load()
        val intent = Intent(this@EnterActivity,MainScreenActivity::class.java)
        intent.putExtra("Authorization",token)
        startActivity(intent)
    }
    var auth = ""
    fun load():String{
        lifecycleScope.launch {
            val Username = email.text.toString()
            val Password = password.text.toString()


                val ac = AccountsRepository()
                val token = ac.login(Username, Password)
                auth = "Bearer " + token

        }
        return  auth
    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@EnterActivity, ExpertsActivityTrue::class.java)
        startActivity(intent)
    }
}