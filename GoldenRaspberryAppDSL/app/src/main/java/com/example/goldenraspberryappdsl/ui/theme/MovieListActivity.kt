package com.example.goldenraspberryappdsl.ui.theme

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity() {

    private val viewModel: MovieListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        movieRecyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.movies.observe(this, { movies ->
            // Definir o adapter com a lista de filmes
            movieRecyclerView.adapter = MovieAdapter(movies)
        })

        applyFiltersButton.setOnClickListener {
            val year = yearFilter.text.toString().toIntOrNull()
            val winnerOnly = winnerFilter.isChecked
            viewModel.loadMovies(year, winnerOnly)
        }

        viewModel.loadMovies()
    }
}
