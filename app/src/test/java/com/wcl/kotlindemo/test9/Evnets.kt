package com.wcl.kotlindemo.test9


/**
 *  @项目名：  KotlinDemo
 *  @包名：    com.wcl.kotlindemo.test9
 *  @文件名:   Evnets
 *  @创建者:   kilin
 *  @创建时间:  2020/7/27 21:19
 *  @描述：    TODO
 */
class Evnets {

    fun main() {
        val eventManager = EventManager()

        //正确写法1:可以删除listener,避免出现SAM转换即可
        val eventListener1 = object : EventManager.OnEventListener {
            override fun onEvent(event: Int) {

            }
        }
        eventManager.addEventListener(eventListener1)
        eventManager.removeEventListener(eventListener1)//可成功删除eventListener1

        //正确写法2:可以删除listener,避免出现SAM转换即可
        val eventListener2 = EventManager.OnEventListener {

        }
        eventManager.addEventListener(eventListener2)
        eventManager.removeEventListener(eventListener2)//可成功删除eventListener2

        //错误示例:下面代码会导致删不掉已经add的listener3,在写代码中应避免
        val eventListener3 = { event: Int ->

        }
        //或者下方代码(匿名内部类),都是不能移除的listener
//        eventManager.addEventListener {
//
//        }
        eventManager.addEventListener(eventListener3)
        eventManager.removeEventListener(eventListener3)//注意:此处删不掉已经add的listener3,因为被进行了SAM转换
    }

}