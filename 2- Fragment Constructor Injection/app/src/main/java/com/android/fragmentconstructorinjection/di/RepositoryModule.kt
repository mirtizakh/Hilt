package com.android.fragmentconstructorinjection.di

import com.android.fragmentconstructorinjection.repository.MainRepository
import com.android.fragmentconstructorinjection.retrofit.BlogRetrofit
import com.android.fragmentconstructorinjection.retrofit.NetworkMapper
import com.android.fragmentconstructorinjection.room.BlogDao
import com.android.fragmentconstructorinjection.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMainRepository(
        blogDao: BlogDao,
        retrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): MainRepository {
        return MainRepository(blogDao, retrofit, cacheMapper, networkMapper)
    }
}