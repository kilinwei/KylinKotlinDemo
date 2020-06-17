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
class Test422 {

    @Test
    fun main() {
        checkNumber(2.3)
    }

    /**
     * 除了精确匹配之外，`when` 语句还允许进行类型匹配。
     * @param num Number
     */
    fun checkNumber(num: Number) {
        when (num) {
            is Int -> println("number is Int")
            is Double -> println("number is Double")
            else -> println("number not support")
        }
    }
}