package com.coding.daggerhilt.framework.datasource.cache

import com.coding.daggerhilt.framework.datasource.cache.model.BlogCacheEntity

interface BlogDaoService {

    suspend fun insert(blogEntity: BlogCacheEntity): Long

    suspend fun get(): List<BlogCacheEntity>

}