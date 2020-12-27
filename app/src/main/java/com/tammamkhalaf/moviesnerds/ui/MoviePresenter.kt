package com.tammamkhalaf.moviesnerds.ui

import com.tammamkhalaf.moviesnerds.data.MovieModel

class MoviePresenter(var view: MovieView) {

    private fun getMovieFromDb(): MovieModel {
        return MovieModel("cast away","6/6/1996","sad movie",1)
    }

    fun getMovieName(){
        view.onGetMovieName(getMovieFromDb().name)
    }
}