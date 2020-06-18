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
class Test63 {

    @Test
    fun main() {
        var arr4 = Array(5,{index -> (index * 2).toString() })
        println(arr4.joinToString())
    }
}