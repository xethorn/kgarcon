package net.xethorn.kgarcon

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class HelloWorldTest {
    private lateinit var helloWorld: HelloWorld

    @BeforeEach
    fun before() {
        helloWorld = HelloWorld()
    }

    @Nested

    inner class `#get` {
        @Nested
        inner class `when called` {
            @Test
            fun `returns Hello World`() {
                assertThat(helloWorld.get()).isEqualTo("Hello World")
            }
        }
    }
}