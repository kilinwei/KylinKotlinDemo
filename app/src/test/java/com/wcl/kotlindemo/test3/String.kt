package com.wcl.kotlindemo.test3


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test3
 *  @文件名:   String
 *  @创建者:   kilin
 *  @创建时间:  2020/6/11 21:45
 *  @描述：    TODO
 */

fun String.letterCount(): Int {
    var count = 0
    for (char in this) {
        if (char.isLetter()) {
            count++
        }
    }
    return count
}