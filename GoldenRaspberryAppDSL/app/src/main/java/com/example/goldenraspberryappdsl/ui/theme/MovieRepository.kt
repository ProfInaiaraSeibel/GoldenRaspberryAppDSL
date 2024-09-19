package com.example.goldenraspberryappdsl.ui.theme

class MovieRepository(private val apiService: MovieApiService) {

    fun getMovies(page: Int, size: Int, winner: Boolean?, year: Int?): Call<ApiResponse> {
        return apiService.getMovies(page, size, winner, year)
    }
}