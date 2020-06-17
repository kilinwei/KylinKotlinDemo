package com.wcl.kotlindemo


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Student
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:14
 *  @描述：    TODO
 */
class Student(var sno: String = "", var grade: Int = 1, name: String, age: Int = 0) :
    Person(name, age) {

}