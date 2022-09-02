package org.example;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 双重校验锁单例类
 * @className：CounterLazy
 * @Author: ckyforever
 * @Date: 2022/9/2 12:08
 */
public class CounterDCL {

    private final AtomicInteger online = new AtomicInteger();

    private volatile static CounterDCL OnLineCounter;

    private CounterDCL() {};

    public static CounterDCL getInstance() {
        if(OnLineCounter == null){
            synchronized (CounterDCL.class){
                if(OnLineCounter == null) OnLineCounter = new CounterDCL();
            }
        }
        return OnLineCounter;
    }

    public void online(){
        this.online.incrementAndGet();
    }

    public void offline(){
        this.online.decrementAndGet();
    }

    public int getOnline(){
        return this.online.get();
    }
}
