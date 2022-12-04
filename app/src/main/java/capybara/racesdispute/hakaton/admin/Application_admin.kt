package capybara.racesdispute.hakaton.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.RelativeLayout
import capybara.racesdispute.hakaton.R

open class Application_admin : AppCompatActivity() {

    private lateinit var rl1: RelativeLayout
    private lateinit var relativeArray: Array<RelativeLayout>
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application_admin)

        listView = findViewById(R.id.listView_1)

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, relativeArray)
        listView.adapter = adapter
    }
}