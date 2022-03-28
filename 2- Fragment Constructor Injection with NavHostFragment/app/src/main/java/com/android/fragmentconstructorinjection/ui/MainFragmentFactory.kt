package com.android.fragmentconstructorinjection.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import javax.inject.Inject

class MainFragmentFactory
@Inject constructor(
    private val someString: String
) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {

        return when (className) {
            MainFragment::class.java.name -> {
                MainFragment(someString)
            }
            else -> super.instantiate(classLoader, className)
        }

    }
}