package com.wcl.kotlindemo

import org.junit.Test

import org.junit.Assert.*
import java.lang.reflect.Array.get
import java.lang.reflect.Field

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    var i = "初始值"
        get() = field
        set(value) {
            field = value
        }


    @Test
    fun addition_isCorrect() {
        println(i)
        i = "修改值"
        println(i)
    }

}

open class Demo {
    open val a = 0
}

class Test : Demo() {
    override val a = 1
}