package org.example.product.impl;

import org.example.product.IWashingMachine;

/**
 * @className：XiaoMiWashingMachine
 * @Author: ckyforever
 * @Date: 2022/9/9 12:02
 */
public class XiaoMiWashingMachine implements IWashingMachine {
    @Override
    public void introduct() {
        System.out.println("我是一台小米洗衣机");
    }
}
