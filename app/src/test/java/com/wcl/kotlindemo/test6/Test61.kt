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
class Test61 {

    @Test
    fun main() {
        var arr1 = arrayOf(1, 2, 3, 4, 5) //等价于java [1,2,3,4,5]
        println(arr1.joinToString())

        var arr2 = arrayOf("0", "2", "3", 'a', 32.3f)
        println(arr2.joinToString())
    }
}