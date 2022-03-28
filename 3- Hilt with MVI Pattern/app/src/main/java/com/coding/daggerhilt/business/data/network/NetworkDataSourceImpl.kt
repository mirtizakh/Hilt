package com.coding.daggerhilt.business.data.network

import com.coding.daggerhilt.business.domain.models.Blog
import com.coding.daggerhilt.framework.datasource.network.BlogRetrofitService
import com.coding.daggerhilt.framework.datasource.network.mappers.NetworkMapper

class NetworkDataSourceImpl
constructor(
    private val blogRetrofitService: BlogRetrofitService,
    private val networkMapper: NetworkMapper
): NetworkDataSource{

    override suspend fun get(): List<Blog> {
        return networkMapper.mapFromEntityList(blogRetrofitService.get())
    }

}