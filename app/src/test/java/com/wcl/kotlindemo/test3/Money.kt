package com.wcl.kotlindemo.test3


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   Money
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:46
 *  @描述：    TODO
 */
class Money() {
    var value = 0

    operator fun plus(money: Money): Money {
        val sum = value + money.value
        val newMoney = Money()
        newMoney.value = sum
        return newMoney
    }

    operator fun plus(i: Int): Money {
        val sum = value + i
        val newMoney = Money()
        newMoney.value = sum
        return newMoney
    }
}