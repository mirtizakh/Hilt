package com.coding.daggerhilt.di

import android.content.Context
import androidx.room.Room
import com.coding.daggerhilt.business.data.cache.CacheDataSource
import com.coding.daggerhilt.business.data.cache.CacheDataSourceImpl
import com.coding.daggerhilt.business.domain.models.Blog
import com.coding.daggerhilt.business.domain.util.EntityMapper
import com.coding.daggerhilt.framework.datasource.cache.BlogDaoService
import com.coding.daggerhilt.framework.datasource.cache.BlogDaoServiceImpl
import com.coding.daggerhilt.framework.datasource.cache.database.BlogDao
import com.coding.daggerhilt.framework.datasource.cache.database.BlogDatabase
import com.coding.daggerhilt.framework.datasource.cache.mappers.CacheMapper
import com.coding.daggerhilt.framework.datasource.cache.model.BlogCacheEntity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CacheModule {

    @Singleton
    @Provides
    fun provideCacheMapper(): EntityMapper<BlogCacheEntity, Blog>{
        return CacheMapper()
    }

    @Singleton
    @Provides
    fun provideBlogDb(@ApplicationContext context: Context): BlogDatabase {
        return Room
            .databaseBuilder(
                context,
                BlogDatabase::class.java,
                BlogDatabase.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideBlogDAO(blogDatabase: BlogDatabase): BlogDao {
        return blogDatabase.blogDao()
    }

    @Singleton
    @Provides
    fun provideBlogDaoService(
        blogDao: BlogDao
    ):BlogDaoService{
        return BlogDaoServiceImpl(blogDao)
    }

    @Singleton
    @Provides
    fun provideCacheDataSource(
        blogDaoService: BlogDaoService,
        cacheMapper: CacheMapper
    ): CacheDataSource{
        return CacheDataSourceImpl(blogDaoService, cacheMapper)
    }


}

























