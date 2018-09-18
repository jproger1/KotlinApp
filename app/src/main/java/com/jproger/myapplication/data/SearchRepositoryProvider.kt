package com.jproger.myapplication.data

object SearchRepositoryProvider {
    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(BashImApiService.create())
    }
}