package com.wcl.kotlindemo.test3

import org.junit.Test


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Test3_4
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:09
 *  @描述：    TODO
 */
class Test35 {


    @Test
    fun main() {
        //不定长参数
        prints("a", "b", "c")

        //多返回值
//        val multiReturnValues = multiReturnValues()
//        val first = multiReturnValues.first
//        val second = multiReturnValues.second
//        val third = multiReturnValues.third
//        println("first:$first  second:$second  third:$third")
//
//        val (a, b, c) = multiReturnValues()
//        println("a:$a  b:$b  c:$c")

        //解构声明
//        var person: Person = Person("Jone", 20)
//        var (name, age) = person //按照形参的顺序,不会去匹配形参的命名,即name和age调换,那么name就会被赋值20
//
//        println("name: $name, age: $age")// 打印：name: Jone, age: 20
    }


    /**
     * 可变参数
     */
    fun prints(vararg strings: String) {
        for (string in strings) {
            println(string)
        }
    }

    /**
     * 多返回值
     */
    fun multiReturnValues(): Triple<Int, Long, Double> {
        return Triple(1, 3L, 10.0)
    }

}

data class Person(var name: String, var age: Int) {
}