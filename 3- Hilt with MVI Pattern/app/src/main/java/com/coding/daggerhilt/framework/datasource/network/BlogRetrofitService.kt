package com.coding.daggerhilt.framework.datasource.network

import com.coding.daggerhilt.framework.datasource.network.model.BlogNetworkEntity

interface BlogRetrofitService {

    suspend fun get(): List<BlogNetworkEntity>
}