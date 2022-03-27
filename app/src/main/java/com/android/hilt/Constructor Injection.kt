package com.android.hilt

import javax.inject.Inject


class ConstructorInjection @Inject constructor(
    private val someOtherClass: SomeOtherClass
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