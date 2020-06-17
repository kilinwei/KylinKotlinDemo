package com.wcl.kotlindemo.test5

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test5
 *  @文件名:   Test5
 *  @创建者:   kilin
 *  @创建时间:  2020/6/16 21:15
 *  @描述：    TODO
 */
class Test51 {

    @Test
    fun main() {
        val p = Person()
        p.name = "Jack"
        p.age = 19
        p.eat()
    }
}