package com.tammamkhalaf.moviesnerds.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tammamkhalaf.moviesnerds.data.MovieModel

class MovieViewModel : ViewModel() {
    var movieNameMutableLiveData:MutableLiveData<String> = MutableLiveData()

    fun getMovieName(){
        var movieName:String = getMovieFromDatabase().name
        movieNameMutableLiveData.value = movieName
    }

    private fun getMovieFromDatabase(): MovieModel {
        return MovieModel("cast away","6/6/1996","sad movie",1)
    }
}