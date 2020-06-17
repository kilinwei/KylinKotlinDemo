package com.wcl.kotlindemo.test2

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test2
 *  @文件名:   Test2
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 20:56
 *  @描述：    TODO
 */
class Test2 {


    @Test
    fun main() {
        val a = 10
        var b = 5
        b = b + 3
//        a = b + 3  //此行报错,Val cannot be reassigned
        println("a = " + a)
        println("b = " + b)
    }
}


/**
 * 声明常量
 *
 */

// 1. 顶层声明
const val NUM_A : String = "顶层声明"

// 2. 在object修饰的类中
object TestConst{
    const val NUM_B = "object修饰的类中"
}

// 3. 伴生对象中
class TestClass{
    companion object {
        const val NUM_C = "伴生对象中声明"
    }
}