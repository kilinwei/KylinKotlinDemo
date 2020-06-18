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
class Test424 {

    @Test
    fun checkNumber() {
        var num:Int = 5
        when(num > 5){
            true -> {
                println("num > 5")
            }
            false ->{
                println("num < 5")
            }
            else -> {
                println("num = 5")
            }
        }
    }
}