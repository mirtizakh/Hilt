package com.coding.daggerhilt.business.data.network

import com.coding.daggerhilt.business.domain.models.Blog

interface NetworkDataSource {

    suspend fun get(): List<Blog>
}