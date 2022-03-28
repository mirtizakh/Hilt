package com.android.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/*
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var someClass: SomeClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        someClass.doSomething()
    }

    @AndroidEntryPoint
    class MyFragment : Fragment() {
        @Inject
        lateinit var someClass: SomeClass
    }

    @ActivityScoped
    class SomeClass @Inject constructor() {
        fun doSomething() {
            println("Do something")

        }
    }
}

 */