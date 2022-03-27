package com.android.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Singleton

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @AndroidEntryPoint
    class MyFragment : Fragment() {
        @Inject
        lateinit var someClass: SomeClass
    }

    @Singleton
    class SomeClass @Inject constructor() {
        fun doSomething() {
            println("Do something")

        }
    }
}