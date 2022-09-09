package org.example.product.impl;

import org.example.product.IAirConditioning;

/**
 * @className：HaierAirConditioning
 * @Author: ckyforever
 * @Date: 2022/9/9 12:02
 */
public class HaierAirConditioning implements IAirConditioning {
    @Override
    public void introduct() {
        System.out.println("我是一台海尔的空调");
    }
}
