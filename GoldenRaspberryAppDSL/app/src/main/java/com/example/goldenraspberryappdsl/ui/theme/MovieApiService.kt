package com.example.goldenraspberryappdsl.ui.theme

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("movies")
    fun getMovies(
        @Query("page") page: Int,
        @Query("size") size: Int,
        @Query("winner") winner: Boolean?,
        @Query("year") year: Int?
    ): Call<ApiResponse>
}
