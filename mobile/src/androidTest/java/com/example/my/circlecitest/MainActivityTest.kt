package com.example.my.circlecitest

import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {
    @Rule
    var mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun changeText_sameActivity() {
        // Type text and then press the button.
        onView(withId(R.id.level)).check(matches(withText("Level 1")))
    }
}

