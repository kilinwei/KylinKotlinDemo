package com.wcl.kotlindemo.test3

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Test38
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:41
 *  @描述：    kotlin中一个文件运行存在多个类
 */
object StringUtil {
    fun letterCount(str: String): Int {
        var count = 0
        for (char in str) {
            if (char.isLetter()) {
                count++
            }
        }
        return count
    }
}

class Test {

    @Test
    fun main() {
        val str = "abc123!#@"
        val count = StringUtil.letterCount(str)
        println("count: $count")

    }
}
