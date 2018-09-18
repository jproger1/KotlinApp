package com.jproger.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jproger.myapplication.data.SearchRepository
import com.jproger.myapplication.data.SearchRepositoryProvider
import io.reactivex.disposables.CompositeDisposable

const val tag:String="MainActivity"

class MainActivity : AppCompatActivity() {

    val compositeDisposable: CompositeDisposable = CompositeDisposable()
    val repository: SearchRepository = SearchRepositoryProvider.provideSearchRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.10
    }
}
