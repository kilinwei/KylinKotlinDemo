package com.wcl.kotlindemo.test6

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test6
 *  @文件名:   Test61
 *  @创建者:   kilin
 *  @创建时间:  2020/6/18 11:16
 *  @描述：    TODO
 */
class Test62 {

    @Test
    fun main() {
        var arr3 = arrayOfNulls<Int>(3)

        //如若不予数组赋值则arr3[0]、arr3[1]、arr3[2]皆为null
        println(arr3.joinToString())

        //为数组arr3赋值
        arr3[0] = 10
        arr3[1] = 20
        arr3[2] = 30
        println(arr3.joinToString())
    }
}