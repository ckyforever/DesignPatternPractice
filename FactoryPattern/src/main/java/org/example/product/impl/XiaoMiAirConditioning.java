package org.example.product.impl;

import org.example.product.IAirConditioning;

/**
 * @className：XiaoMiAirConditioning
 * @Author: ckyforever
 * @Date: 2022/9/9 12:00
 */
public class XiaoMiAirConditioning implements IAirConditioning {
    @Override
    public void introduct() {
        System.out.println("我是一台小米的空调");
    }
}
