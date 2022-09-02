package org.example;

/**
 * 懒汉单例类
 * @className：CounterLazy
 * @Author: ckyforever
 * @Date: 2022/9/2 12:08
 */
public class CounterLazy {

    private int online = 0;

    private static CounterLazy OnLineCounter;

    private CounterLazy() {} ;

    public static CounterLazy getInstance() {
        if (OnLineCounter == null) {
            OnLineCounter = new CounterLazy();
        }
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
