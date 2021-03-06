package be.appfoundry.aipdemo.activity.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import be.appfoundry.aipdemo.R
import be.appfoundry.aipdemo.extension.app
import be.appfoundry.aipdemo.model.UserLogger
import kotlinx.android.synthetic.main.activity_common.*
import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var userLogger: UserLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        app.appComponent.inject(this)

        setContentView(R.layout.activity_common)

        activityCommonButton.setOnClickListener {
            activityCommonTitle.text = userLogger.log()
        }
    }
}