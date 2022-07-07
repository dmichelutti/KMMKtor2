package it.overit.ktorpoc.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import it.overit.ktorpoc.Greeting
import android.widget.TextView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    private val mainScope = MainScope()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "Loading..."
        mainScope.launch {
            kotlin.runCatching {
                Greeting().getDogList()
            }.onSuccess {
                tv.text = it.message.toString()
            }.onFailure {
                tv.text = "Error: ${it.localizedMessage}"
            }
        }
    }
}
