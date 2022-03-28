package com.android.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject



/*
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var constructorInjection: ConstructorInjection
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constructorInjection.printValues()
        constructorInjection.someOtherClass.doSomething()
    }

    class ConstructorInjection @Inject constructor(
         val someOtherClass: SomeOtherClass
    ) {

        fun printValues() {
            someOtherClass.doSomething()
        }
    }

    class SomeOtherClass @Inject constructor() {
        fun doSomething() {
            println("Do something")
        }
    }
}

 */