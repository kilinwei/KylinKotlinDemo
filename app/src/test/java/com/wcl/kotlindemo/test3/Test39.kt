package com.wcl.kotlindemo.test3

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Test39
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:51
 *  @描述：    TODO
 */
class Test39 {

    @Test
    fun main() {
        val money1 = Money()
        money1.value = 8
        val money2 = Money()
        money2.value = 5
        val money3 = money1 + money2
        println("money3.value: ${money3.value}")
    }
}