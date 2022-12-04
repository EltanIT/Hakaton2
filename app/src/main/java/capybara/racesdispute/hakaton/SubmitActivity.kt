package capybara.racesdispute.hakaton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.lifecycleScope
import capybara.racesdispute.hakaton.server.AccountsRepository
import kotlinx.coroutines.launch
var token2 : String = ""
class SubmitActivity : AppCompatActivity() {

    private lateinit var full_name: AppCompatEditText
    private lateinit var post: AppCompatEditText
    private lateinit var job_place: AppCompatEditText
    private lateinit var topic_work: AppCompatEditText
    private lateinit var title_work: AppCompatEditText
    private lateinit var annotation: AppCompatEditText
    private lateinit var radio1: RadioButton
    private lateinit var radio2: RadioButton
    private lateinit var file: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)

        full_name = findViewById(R.id.full_name)
        post = findViewById(R.id.post)
        job_place = findViewById(R.id.job_place)
        topic_work = findViewById(R.id.topic_work)
        title_work = findViewById(R.id.title_work)
        annotation = findViewById(R.id.annotation)
        radio1 = findViewById(R.id.radio1)
        radio2 = findViewById(R.id.radio2)

        var token = intent.getStringExtra("Authorization")
        token2 = token!!

    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@SubmitActivity, MainScreenActivity::class.java)
        startActivity(intent)
    }

    fun Continue(view: View) {

        lifecycleScope.launch {
            val full_name = full_name.text.toString()
            val post = post.text.toString()
            val job_place = job_place.text.toString()
            val topic_work = topic_work.text.toString()
            val title_work = title_work.text.toString()
            val annotation = annotation.text.toString()
            val file = file
            var token = token2

                val ac = AccountsRepository()
                 ac.CreateQuery(full_name, post, job_place, topic_work, title_work, annotation, file,token)

            val intent = Intent(this@SubmitActivity, Submit_application_delete::class.java)
            startActivity(intent)
        }
    }

    fun radio1_clicked(view: View) {
        file = "print"
    }
    fun radio2_clicked(view: View) {
        file = "video"
    }
}

