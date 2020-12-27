package com.tammamkhalaf.moviesnerds.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import butterknife.BindView
import butterknife.ButterKnife
import com.tammamkhalaf.moviesnerds.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    @BindView(R.id.textView)
    lateinit var movieNameTv: TextView

    @BindView(R.id.button)
    lateinit var button: Button

    lateinit var movieViewModel:MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        button.setOnClickListener(this)

        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        movieViewModel.movieNameMutableLiveData.observe(this, {
            movieNameTv.text = it
        })
    }

    override fun onClick(view: View?) {
        if(view?.id == R.id.button){
            movieViewModel.getMovieName()
        }
    }


}