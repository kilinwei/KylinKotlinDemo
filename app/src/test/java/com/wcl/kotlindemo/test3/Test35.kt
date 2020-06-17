package com.wcl.kotlindemo.test3

import com.wcl.kotlindemo.Student
import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Test3_5
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:11
 *  @描述：    TODO
 */
class Test35 {

    @Test
    fun run() {
        var animal = "cat"
        run {
            //单独的作用域
            val animal = "dog"
            println(animal)   // dog
        }
        println(animal)       //cat

        val i = run {
            //最后一行作为返回值
            if (true) 1 else 0
        }
        println(i) //1
    }

    @Test
    fun tRun() {
        val student = Student(name = "李四")
        val s = student.run {
            this.name = "王五"  //this.可以省略
            age = 1
            sno = "abc"
            2
        }
        println(s)  //2
        println(student.name) //王五
    }

    @Test
    fun let() {
        val student = Student(name = "李四")
        val s = student.let {
            it.name = "王五"
            it.age = 1
            it.sno = "abc"
            2
        }
        println(s)    //2
        println(student.name)  //王五
    }

    @Test
    fun apply() {
        val student = Student(name = "李四")
        val s = student.apply {
            this.name = "王五"
            age = 1
            sno = "abc"
            2
        }
        println(s)
        println(s == student) //true
        println(student.name) //王五
    }

    @Test
    fun also(){
        val student = Student(name = "李四")
        val s = student.also {
            it.name = "王五"
            it.age = 1
            it.sno = "abc"
            2
        }
        println(s)
        println(s == student) //true
        println(student.name) //王五
    }
}