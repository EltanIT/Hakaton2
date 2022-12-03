package capybara.racesdispute.hakaton.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.RelativeLayout
import capybara.racesdispute.hakaton.R

open class Application_admin : AppCompatActivity() {

    private lateinit var rl1: RelativeLayout
    private lateinit var array: ArrayList<Application_list_admin>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application_admin)

        array = ArrayList()

    }
}