import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    private val viewModel: DashboardViewModel by viewModels()

    private fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        viewModel.yearsWithMultipleWinners.observe(this, { years ->
            yearsMultipleWinners.text = years.joinToString { it.year.toString() }
        })

        viewModel.topStudios.observe(this, { studios ->
            topStudios.text = studios.joinToString { it.name }
        })

        viewModel.producersInterval.observe(this, { intervals ->
            producersInterval.text = intervals.toString()
        })

        viewModel.loadDashboardData()
    }
}
