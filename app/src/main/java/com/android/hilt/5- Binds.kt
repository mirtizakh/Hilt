package com.android.hilt


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import dagger.Binds
import dagger.Module
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

@InstallIn(SingletonComponent::class)
@Module
abstract class MyModule{

    @Singleton
    @Binds
    abstract fun bindSomeDependency(
        someImp : SomeInterfaceImp
    ) : SomeInterface


    /*

     /* The issue with Binds it will not work in all scenarios */

     @Singleton
     @Binds
     abstract fun bindGson(
         gson : Gson
     ) : Gson

    */


}

 */

 /* @Binds as the name says is for binding classes (which are already provided) to interfaces.
    @Provides however provides classes by "creating" them
 */



