package com.example.justintey.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_detail.*


class MovieDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        var movie = Movie()
        title_detail.text = movie.movieName
        overview_detail.text = movie.movieDesc
        language_detail.text = movie.language
        rel_date_detail.text = movie.relDate
        suitable_detail.text = movie.suitable
    }
}

