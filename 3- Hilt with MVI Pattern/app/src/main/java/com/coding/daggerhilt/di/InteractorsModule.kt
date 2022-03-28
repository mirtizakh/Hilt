package com.coding.daggerhilt.di

import com.coding.daggerhilt.business.data.cache.CacheDataSource
import com.coding.daggerhilt.business.data.network.NetworkDataSource
import com.coding.daggerhilt.business.interactors.GetBlogs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object InteractorsModule {

    @Singleton
    @Provides
    fun provideGetBlogs(
        cacheDataSource: CacheDataSource,
        networkDataSource: NetworkDataSource
    ): GetBlogs{
        return GetBlogs(cacheDataSource, networkDataSource)
    }
}














