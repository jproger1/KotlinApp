package com.jproger.myapplication.data

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface BashImApiService {

    @GET("api/get")
    fun searchQuotes(
            @Query("site") site:String,
            @Query("name") name:String,
            @Query("num") num:Int
    ) : io.reactivex.Observable<List<Quote>>

    @GET("api/sources")
    fun searchSources() : io.reactivex.Observable<List<SourceOfQuote>>

    companion object Factory{
        fun create():BashImApiService {
            val gson:Gson = GsonBuilder().setLenient().create()
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("htttp://umorili.herokuapp.com/")
                    .build()
            return retrofit.create(BashImApiService::class.java)
        }
    }
}