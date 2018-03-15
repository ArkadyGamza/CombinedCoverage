package com.example.arkadygamza.combinedcoverage

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class KotlinExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_method1() {
        val clazz = UnitTestTargetJava()
        clazz.testMeFromKotlin()
    }
}
