package org.example.factory.impl;

import org.example.factory.IProductFactory;
import org.example.product.IAirConditioning;
import org.example.product.IWashingMachine;
import org.example.product.impl.HaierAirConditioning;
import org.example.product.impl.HaierWashingMachine;

/**
 * @className：HaierFactory
 * @Author: ckyforever
 * @Date: 2022/9/9 12:05
 */
public class HaierFactory implements IProductFactory {

    @Override
    public IAirConditioning createAirConditioning() {
        return new HaierAirConditioning();
    }

    @Override
    public IWashingMachine createWashingMachine() {
        return new HaierWashingMachine();
    }
}
