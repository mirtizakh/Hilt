package com.coding.daggerhilt.framework.datasource.network

import com.coding.daggerhilt.framework.datasource.network.model.BlogNetworkEntity
import com.coding.daggerhilt.framework.datasource.network.retrofit.BlogRetrofit

class BlogRetrofitServiceImpl
constructor(
    private val blogRetrofit: BlogRetrofit
): BlogRetrofitService {

    override suspend fun get(): List<BlogNetworkEntity> {
        return blogRetrofit.get()
    }
}