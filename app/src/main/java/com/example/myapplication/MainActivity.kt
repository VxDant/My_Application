package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.livedata.observe(this, Observer {

            textView.text = "$it"

        })

//        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//        textView.text = mainViewModel.counter.toString()

        button1.setOnClickListener{
            Toast.makeText(this,"hello world", Toast.LENGTH_SHORT).show()
//            increment()
//            textView.text= mainViewModel.counter.toString()
            mainViewModel.updateLiveData()

        }
    }


//    private fun increment() {
//        mainViewModel.increment()
//        textView.text = mainViewModel.counter.toString()
//    }


}
