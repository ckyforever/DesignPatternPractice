package org.example;

/**
 * 饿汉单例类
 * @className：CounterHungry
 * @Author: ckyforever
 * @Date: 2022/9/2 12:07
 */
public class CounterHungry {
    private int online = 0;

    private final static CounterHungry OnLineCounter = new CounterHungry();

    private CounterHungry() {};

    public static CounterHungry getInstance() {
        return OnLineCounter;
    }

    public void online(){
        this.online++;
    }

    public void offline(){
        this.online--;
    }

    public int getOnline(){
        return this.online;
    }
}
