package com.coding.daggerhilt.framework.datasource.cache

import com.coding.daggerhilt.framework.datasource.cache.database.BlogDao
import com.coding.daggerhilt.framework.datasource.cache.model.BlogCacheEntity

class BlogDaoServiceImpl
constructor(
    private val blogDao: BlogDao
): BlogDaoService {

    override suspend fun insert(blogEntity: BlogCacheEntity): Long {
        return blogDao.insert(blogEntity)
    }

    override suspend fun get(): List<BlogCacheEntity> {
        return blogDao.get()
    }
}