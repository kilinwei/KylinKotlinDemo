package com.wcl.kotlindemo.test2

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test2
 *  @文件名:   Test2
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 20:56
 *  @描述：    TODO
 */
class Test2 {


    @Test
    fun main() {
        val a = 10
        var b = 5
        b = b + 3
//        a = b + 3  //此行报错,Val cannot be reassigned
        println("a = " + a)
        println("b = " + b)

        //val 自定义 get
//        val mime = Mime()
//        println("isEmpty = ${mime.isEmpty}")
//        println("num = ${mime.num}")

       // var 自定义get set
//        val mime = Mime()
//
//        println("str = ${mime.str1}")
//        mime.str1 = ""
//        println("str = ${mime.str1}")
//        mime.str1 = "kotlin"
//        println("str = ${mime.str1}")
//
//        println("str2 = ${mime.str2}")
//        mime.str2 = ""
//        println("str2 = ${mime.str2}")
//        mime.str2 = "kotlin"
//        println("str2 = ${mime.str2}")

    }
}



/**
 * val 自定义 get
 * @property size Int
 * @property isEmpty Boolean
 * @property num Int
 */
class Mime{
    // size属性
    private val size = 0

    // 即isEmpty这个属性，是判断该类的size属性是否等于0
    val isEmpty : Boolean
        get() = this.size == 0

    // 另一个例子
    val num = 2
        get() = if (field > 5) 10 else 0
}

/**
 * var 自定义get set
 * @property str1 String
 * @property str2 String
 */
//class Mime{
//
//    var str1 = "test"
//        get() = field   // 这句可以省略，kotlin默认实现的方式
//        set(value){
//            field = if (value.isNotEmpty()) value else "null"
//        }
//
//    var str2 = ""
//        get() = "随意怎么修改都不会改变"
//        set(value){
//            field = if (value.isNotEmpty()) value else "null"
//        }
//}

/**
 * 声明常量
 *
 */
// 1. 顶层声明常量
const val NUM_A : String = "顶层声明"

// 2. 在object修饰的类中声明常量
object TestConst{
    const val NUM_B = "object修饰的类中"
}

// 3. 伴生对象中声明常量
class TestClass{
    companion object {
        const val NUM_C = "伴生对象中声明"
    }
}

