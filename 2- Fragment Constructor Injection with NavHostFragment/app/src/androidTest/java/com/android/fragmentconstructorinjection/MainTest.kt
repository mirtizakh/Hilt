package com.android.fragmentconstructorinjection

import androidx.test.espresso.matcher.ViewMatchers.assertThat
import com.android.fragmentconstructorinjection.di.AppModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import dagger.hilt.components.SingletonComponent
import junit.framework.TestCase.assertEquals
import org.hamcrest.CoreMatchers.containsString
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import javax.inject.Singleton

@UninstallModules(AppModule::class)
@HiltAndroidTest
class MainTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var someString :String
    @Before
    fun inject(){
        hiltRule.inject()
    }

    @Test
    fun someTest(){
     assertThat(someString,containsString("testing"))
    }

    @InstallIn(SingletonComponent::class)
    @Module
    object TestAppModule {

        @Singleton
        @Provides
        fun provideSomeString(): String {
            return "This is some testing string"
        }
    }
}