package com.coding.daggerhilt.business.data.cache

import com.coding.daggerhilt.business.domain.models.Blog

interface CacheDataSource {

    suspend fun insert(blog: Blog): Long

    suspend fun insertList(blogs: List<Blog>)

    suspend fun get(): List<Blog>
}