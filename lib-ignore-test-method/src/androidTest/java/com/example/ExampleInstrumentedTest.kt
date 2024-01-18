package com.example

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Ignore
    @Test
    fun useAppContext() = assertEquals(
        "com.example.lib_ignore_test_method.test",
        InstrumentationRegistry.getInstrumentation().targetContext.packageName,
    )

    @Test
    fun empty() = Unit
}
