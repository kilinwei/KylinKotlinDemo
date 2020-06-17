package com.wcl.kotlindemo.test4

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test4
 *  @文件名:   Test41
 *  @创建者:   kilin
 *  @创建时间:  2020/6/16 20:46
 *  @描述：    TODO
 */
class Test41 {
    @Test
    fun main() {
        println(largerNumber(5, 8))
    }

    fun largerNumber(num1: Int, num2: Int): Int {
        val value = if (num1 > num2) {
            num1
        } else {
            num2
        }
        return value
    }

    /**
     * 上述代码，`value` 其实是一个多余的变量，我们可以直接将  `if` 语句返回，这样代码将会变得更加精简，如下所示：
     */
//    fun largerNumber(num1: Int, num2: Int): Int {
//        return if (num1 > num2) {
//            num1
//        } else {
//            num2
//        }
//    }

    /**
     * 当一个函数只有一行代码时，可以省略函数体部分，直接将这一行代码使用等号串连在函数定义的尾部。
     * 虽然 `largerNumber()`  函数不止只有一行代码，但是它和只有一行代码的作用是相同的，
     * 只是 `return` 了一下 if 语句的返回值而已，符合该语法糖的使用条件。那么我们就可以将代码进一步精简：
     */
//    fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) {
//        num1
//    } else {
//        num2
//    }

}