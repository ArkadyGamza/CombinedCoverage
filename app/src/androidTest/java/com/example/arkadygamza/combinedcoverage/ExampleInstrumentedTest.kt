package com.example.arkadygamza.combinedcoverage

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.arkadygamza.combinedcoverage", appContext.packageName)
    }

    @Test
    fun integration_test1() {
        val appContext = InstrumentationRegistry.getTargetContext()
        InstrumentationTestTargetJava(appContext).testMeFromKotlin()
    }
}
