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
class Test421 {

    @Test
    fun main() {
        println(getScore("Tom"))
    }

    fun getScore(name: String): Int {
        var value: Int
        when (name) {
            "Tom" -> {
                value = 86
            }
            "Jim" -> {
                value = 86
            }
            "Jack" -> {
                value = 95
            }
            "Lily" -> {
                value = 100
            }
            else -> {
                value = 0
            }
        }
        return value
    }

    /**
     * `when`的执行逻辑里,即 `{}` 只有一行代码时, `{}` 可以省略,,精简如下:
     */
//    fun getScore(name: String): Int {
//        var value: Int
//        when (name) {
//            "Tom" -> value = 86
//            "Jim" -> value = 86
//            "Jack" -> value = 95
//            "Lily" -> value = 100
//            else -> value = 0
//        }
//        return value
//    }

    /**
     * ` when ` 也可以有返回值的,可以再精简:
     */
//    fun getScore(name: String): Int {
//        return when (name) {
//            "Tom" -> 86
//            "Jim" -> 86
//            "Jack" -> 95
//            "Lily" -> 100
//            else -> 0
//        }
//    }

    /**
     * 使用单行函数语法糖,最后精简如下:
     */
//    fun getScore(name: String): Int = when (name) {
//        "Tom" -> 86
//        "Jim" -> 86
//        "Jack" -> 95
//        "Lily" -> 100
//        else -> 0
//    }
}