package com.wcl.kotlindemo.test5

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test5
 *  @文件名:   Test53
 *  @创建者:   kilin
 *  @创建时间:  2020/6/17 15:00
 *  @描述：    TODO
 */
interface Study {
    fun readBooks()
    fun doHomework()
}

class Student(val name: String, val age: Int) : Study {
    override fun readBooks() {
        println(name + " is reading.")
    }

    override fun doHomework() {
        println(name + " is doing homework.")
    }
}

@Test
fun main() {
    val student = Student("张三", 18)
    student.readBooks()
    student.doHomework()
}