package com.coding.daggerhilt.di

import com.coding.daggerhilt.business.data.network.NetworkDataSource
import com.coding.daggerhilt.business.data.network.NetworkDataSourceImpl
import com.coding.daggerhilt.business.domain.models.Blog
import com.coding.daggerhilt.business.domain.util.EntityMapper
import com.coding.daggerhilt.framework.datasource.network.BlogRetrofitService
import com.coding.daggerhilt.framework.datasource.network.BlogRetrofitServiceImpl
import com.coding.daggerhilt.framework.datasource.network.mappers.NetworkMapper
import com.coding.daggerhilt.framework.datasource.network.model.BlogNetworkEntity
import com.coding.daggerhilt.framework.datasource.network.retrofit.BlogRetrofit
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideNetworkMapper(): EntityMapper<BlogNetworkEntity, Blog>{
        return NetworkMapper()
    }

    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()
    }

    @Singleton
    @Provides
    fun provideRetrofit(gson:  Gson): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl("https://open-api.xyz/placeholder/")
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Singleton
    @Provides
    fun provideBlogService(retrofit: Retrofit.Builder): BlogRetrofit {
        return retrofit
            .build()
            .create(BlogRetrofit::class.java)
    }

    @Singleton
    @Provides
    fun provideRetrofitService(
        blogRetrofit: BlogRetrofit
    ): BlogRetrofitService{
        return BlogRetrofitServiceImpl(blogRetrofit)
    }

    @Singleton
    @Provides
    fun provideNetworkDataSource(
        blogRetrofitService: BlogRetrofitService,
        networkMapper: NetworkMapper
    ): NetworkDataSource{
        return NetworkDataSourceImpl(blogRetrofitService, networkMapper)
    }

}




















