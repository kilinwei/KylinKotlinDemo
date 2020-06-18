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
class Test425 {

    @Test
    fun checkNumber() {
        var arrayList = arrayOf(1,2,3,4,5)
        when(1){
            in arrayList.toIntArray() -> {
                println("1 存在于 arrayList数组中")
            }
            in 0 .. 10 -> println("1 属于于 0~10 中")
            !in 5 .. 15 -> println("1 不属于 5~15 中")
            else -> {
                println("都没匹配上")
            }
        }
    }
}