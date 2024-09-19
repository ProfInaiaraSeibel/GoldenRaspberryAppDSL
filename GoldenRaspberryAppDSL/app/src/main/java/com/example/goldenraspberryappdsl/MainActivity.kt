package com.example.goldenraspberryappdsl

import android.content.Intent
import android.os.Bundle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import com.example.goldenraspberryappdsl.ui.theme.GoldenRaspberryAppDSLTheme

class MainActivity : AppCompatActivity() {
    private override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dashboardButton.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }

        movieListButton.setOnClickListener {
            startActivity(Intent(this, MovieListActivity::class.java))
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GoldenRaspberryAppDSLTheme {
        Greeting("Android")
    }
}