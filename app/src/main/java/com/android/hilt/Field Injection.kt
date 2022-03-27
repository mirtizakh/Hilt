package com.android.hilt

import javax.inject.Inject


class FiledInjection {

    // Field Injection
    @Inject
    lateinit var someClass: SomeClass

    fun printValues() {
        someClass.doSomething()
    }
}

class SomeClass @Inject constructor() {
    fun doSomething() {
        println("Do something")

    }
}