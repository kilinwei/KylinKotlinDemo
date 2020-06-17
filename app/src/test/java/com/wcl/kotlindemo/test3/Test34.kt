package com.wcl.kotlindemo.test3

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Test3_4
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:09
 *  @描述：    TODO
 */
class Test34 {
    fun printParams(str: String = "hello world", num: Int) {
        println("num is $num , str is $str")
    }

    @Test
    fun main() {
//        printParams(123) //报错,因为`printParams()`函数定义的第一个参数是 `String` 类型的,编译器会认为我们要将一个 `Int` 类型的值赋值给一个 `String` 类型的参数,会报类型不匹配的错误
        printParams(num = 123,str = "world")
        printParams(num = 123)
    }
}