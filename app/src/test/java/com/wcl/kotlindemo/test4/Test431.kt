package com.wcl.kotlindemo.test4

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test4
 *  @文件名:   Test42
 *  @创建者:   kilin
 *  @创建时间:  2020/6/16 20:51
 *  @描述：    TODO
 */
class Test431 {

    val range = 0..10

//    val range = 0 until 10

    val rangeDouble = 0.0 .. 10.0

    @Test
    fun main() {
        for (i in range) {
            println(i)
        }
//        println(range.joinToString())//快速打印区间内的值的方法

//        if(3.0 in rangeDouble){
////            println("3.0 in $rangeDouble")
////        }
//
//        if(11.0 !in rangeDouble){
//            println("11.0 not in $rangeDouble")
//        }
    }


}