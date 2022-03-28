package com.android.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

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
    private val someInterfaceImp: SomeInterface
){
    fun doAThing(): String{
        return "Look I got: ${someInterfaceImp.getAThing()}"
    }
}

class SomeInterfaceImp
@Inject
constructor() : SomeInterface{
    override fun getAThing() : String{
        return "A Thing"
    }
}

interface SomeInterface{
    fun getAThing() : String
}

 */