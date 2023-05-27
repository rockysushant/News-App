package com.androiddevs.mvvmnewsapp.ui.repository

import com.androiddevs.mvvmnewsapp.ui.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.ui.db.ArticleDatabase
import retrofit2.Retrofit

class NewsRepository(
    val db: ArticleDatabase

) {
    suspend fun getBreakingNews(countryCode:String,pageNumber: Int) = RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}
