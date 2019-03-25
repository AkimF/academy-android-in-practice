package be.appfoundry.aipdemo.activity.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import be.appfoundry.aipdemo.R
import kotlinx.android.synthetic.main.activity_reactive.*

class MvvmActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_reactive)

    val viewModel = ViewModelProviders.of(this).get(RandomNumberViewModel::class.java)
    viewModel.number.observe(this, Observer { number ->
      activity_reactive_log.text = "The number is $number"
    })

    activity_reactive_button.setOnClickListener {
      viewModel.generateRandom()
    }
  }
}