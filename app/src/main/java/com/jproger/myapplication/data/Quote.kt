package com.jproger.myapplication.data

import com.google.gson.annotations.SerializedName

data class Quote(
        @SerializedName("site")  val site: String,
        @SerializedName("name")  val name: String,
        @SerializedName("desk")  val desk: String,
        @SerializedName("elementPureHtml")  val htmlText: String,
        @SerializedName("link")  val link: String
)

data class SourceOfQuote(
        @SerializedName("site")  val site: String,
        @SerializedName("name")  val name: String,
        @SerializedName("url")  val url: String,
        @SerializedName("parsel")  val parsel: String,
        @SerializedName("encoding")  val encoding: String,
        @SerializedName("linkpar")  val linkpar: String,
        @SerializedName("desk")  val desk: String
)
