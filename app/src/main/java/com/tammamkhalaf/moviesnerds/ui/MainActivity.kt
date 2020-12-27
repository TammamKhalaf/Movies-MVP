package com.tammamkhalaf.moviesnerds.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import com.tammamkhalaf.moviesnerds.R

class MainActivity : AppCompatActivity(),MovieView, View.OnClickListener {
    private lateinit var presenter:MoviePresenter

    @BindView(R.id.textView)
    lateinit var movieNameTv: TextView

    @BindView(R.id.button)
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        button.setOnClickListener(this)
        presenter = MoviePresenter(this)
    }

    override fun onGetMovieName(movieName: String) {
        movieNameTv.text = movieName
    }

    override fun onClick(view: View?) {
        if(view?.id == R.id.button){
            presenter.getMovieName()
        }
    }


}