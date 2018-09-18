package com.jproger.myapplication.data

class SearchRepository (val apiService: BashImApiService) {
    fun SearchQuotes(site: String, name: String): io.reactivex.Observable<List<Quote>> {
        return apiService.searchQuotes(site, name, 50)
    }

    fun SearchSourcesOfQuotes(site: String, name: String): io.reactivex.Observable<List<SourceOfQuote>> {
        return apiService.searchSources()
    }
}