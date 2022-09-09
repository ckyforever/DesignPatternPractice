package org.example.product.impl;

import org.example.product.IWashingMachine;

/**
 * @className：HaierWashingMachine
 * @Author: ckyforever
 * @Date: 2022/9/9 12:03
 */
public class HaierWashingMachine implements IWashingMachine {
    @Override
    public void introduct() {
        System.out.println("这是一台海尔洗衣机");
    }
}
