package com.wcl.kotlindemo.test3

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Test3_3
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:07
 *  @描述：    TODO
 */
class Test33 {
    fun printParams(num: Int,str: String = "hello world") {
        println("num is $num , str is $str")
    }

    @Test
    fun main(){
        printParams(123)
    }
}
