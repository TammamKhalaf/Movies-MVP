package com.tammamkhalaf.moviesnerds.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import butterknife.BindView
import butterknife.ButterKnife
import com.tammamkhalaf.moviesnerds.R
import com.tammamkhalaf.moviesnerds.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var movieViewModel:MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        binding.viewModel = movieViewModel
        binding.lifecycleOwner = this
    }
}