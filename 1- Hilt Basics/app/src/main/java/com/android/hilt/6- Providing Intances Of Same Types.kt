package com.android.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

/*
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var someClass: SomeClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(someClass.doAThing())
    }
}

class SomeClass
@Inject
constructor(
    private val someInterfaceImp: SomeInterface,
    private val gson: Gson
) {
    fun doAThing(): String {
        return "Look I got: ${someInterfaceImp.getAThing()}"
    }
}

class SomeInterfaceImp
@Inject
constructor() : SomeInterface {
    override fun getAThing(): String {
        return "A Thing"
    }
}

interface SomeInterface {
    fun getAThing(): String
}

@InstallIn(SingletonComponent::class)
@Module
class MyModule {

    @Singleton
    @Provides
    fun provideSomeInterface(): SomeInterface {
        return SomeInterfaceImp()
    }

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return Gson()
    }

}

 */