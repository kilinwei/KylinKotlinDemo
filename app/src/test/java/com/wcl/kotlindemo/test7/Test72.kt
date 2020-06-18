package com.wcl.kotlindemo.test7

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test7
 *  @文件名:   Test72
 *  @创建者:   kilin
 *  @创建时间:  2020/6/18 11:43
 *  @描述：    TODO
 */
class Test72 {

    @Test
    fun main() {
        val list = listOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")

        //或者
        val mutableList = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
        //Kotlin有出色的类型推导机制,泛型声明<String>可以省略

        //或者
        val stringList = ArrayList<String>()
        //对应的java代码为
        //List<String> stringList = new ArrayList<>();

        println(list.joinToString())
    }
}