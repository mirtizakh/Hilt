package com.coding.daggerhilt.business.data.cache

import com.coding.daggerhilt.business.domain.models.Blog
import com.coding.daggerhilt.framework.datasource.cache.BlogDaoService
import com.coding.daggerhilt.framework.datasource.cache.mappers.CacheMapper

class CacheDataSourceImpl
constructor(
    private val blogDaoService: BlogDaoService,
    private val cacheMapper: CacheMapper
): CacheDataSource{

    override suspend fun insert(blog: Blog): Long {
        return blogDaoService.insert(cacheMapper.mapToEntity(blog))
    }

    override suspend fun insertList(blogs: List<Blog>){
        for(blog in blogs) {
            blogDaoService.insert(cacheMapper.mapToEntity(blog))
        }
    }

    override suspend fun get(): List<Blog> {
        return cacheMapper.mapFromEntityList(blogDaoService.get())
    }

}
