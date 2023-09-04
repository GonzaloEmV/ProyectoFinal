package com.example.proyectofinal

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.*

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.click

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(TextCompareView::class.java)

    @Test
    fun testTextCompare(){
        val textOne = "hola"
        val textTwo = "hola"

        onView(withId(R.id.editTextOne)).perform(typeText(textOne))
        onView(withId(R.id.editTextTwo)).perform(typeText(textTwo))

        onView(withId(R.id.btnCompare)).perform(click())

        val resulMessage = "LOS TEXTOS SON IGUALES"
        onView(withId(R.id.result)).check((matches(withText(resulMessage))))
    }
}