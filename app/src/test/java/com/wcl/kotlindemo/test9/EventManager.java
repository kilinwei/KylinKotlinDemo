package com.wcl.kotlindemo.test9;

import java.util.HashSet;

/**
 * @项目名： KotlinDemo
 * @包名： com.wcl.kotlindemo.test9
 * @文件名: EventManager
 * @创建者: kilin
 * @创建时间: 2020/7/27 21:15
 * @描述： TODO
 */
public class EventManager {
    public interface OnEventListener {
        void onEvent(int event);
    }

    private HashSet<OnEventListener> listeners = new HashSet<>();

    public boolean addEventListener(OnEventListener listener) {
        return listeners.add(listener);
    }

    public boolean removeEventListener(OnEventListener listener) {
        return listeners.remove(listener);
    }
}
