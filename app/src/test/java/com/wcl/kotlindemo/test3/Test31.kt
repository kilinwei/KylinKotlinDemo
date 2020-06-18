package com.wcl.kotlindemo.test3

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Test3_1
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:02
 *  @描述：    TODO
 */
class Test31 {

    fun methodName(param1: Int, param2: Int): String {
        return (param1 + param2).toString()
    }

    fun methodName2(param1: Int, param2: Int) = (param1 + param2).toString()
}