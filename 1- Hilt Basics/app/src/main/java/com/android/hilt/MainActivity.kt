package com.android.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier
import javax.inject.Singleton

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var someClass: SomeClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(someClass.doAThing1())
        println(someClass.doAThing2())
    }
}

class SomeClass
@Inject
constructor(
    @Impl1 private val someInterfaceImp1: SomeInterface,
    @Impl2 private val someInterfaceImp2: SomeInterface,
) {
    fun doAThing1(): String {
        return "Look I got: ${someInterfaceImp1.getAThing()}"
    }

    fun doAThing2(): String {
        return "Look I got: ${someInterfaceImp2.getAThing()}"
    }

}

class SomeInterfaceImp1
@Inject
constructor() : SomeInterface {
    override fun getAThing(): String {
        return "A Thing 1"
    }
}

class SomeInterfaceImp2
@Inject
constructor() : SomeInterface {
    override fun getAThing(): String {
        return "A Thing 2"
    }
}

interface SomeInterface {
    fun getAThing(): String
}

@InstallIn(SingletonComponent::class)
@Module
class MyModule {

    @Impl1
    @Singleton
    @Provides
    fun provideSomeInterface1(): SomeInterface {
        return SomeInterfaceImp1()
    }

    @Impl2
    @Singleton
    @Provides
    fun provideSomeInterface2(): SomeInterface {
        return SomeInterfaceImp2()
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Impl1


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Impl2
