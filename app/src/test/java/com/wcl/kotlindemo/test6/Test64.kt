package com.wcl.kotlindemo.test6

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test6
 *  @文件名:   Test64
 *  @创建者:   kilin
 *  @创建时间:  2020/6/18 11:23
 *  @描述：    TODO
 */
class Test64 {

    @Test
    fun main() {
        var intArr: IntArray = intArrayOf(1,2,3,4,5)
        println(intArr.joinToString())

        var charArr: CharArray = charArrayOf('a','1','b','c','3','d')
        println(charArr.joinToString())


        var longArr: LongArray = longArrayOf(12L,1254L,123L,111L)
        println(longArr.joinToString())

    }
}