package org.example.factory.impl;

import org.example.factory.IProductFactory;
import org.example.product.IAirConditioning;
import org.example.product.IWashingMachine;
import org.example.product.impl.XiaoMiAirConditioning;
import org.example.product.impl.XiaoMiWashingMachine;

/**
 * @className：XiaoMiFactory
 * @Author: ckyforever
 * @Date: 2022/9/9 11:59
 */
public class XiaoMiFactory implements IProductFactory {
    @Override
    public IAirConditioning createAirConditioning() {
        return new XiaoMiAirConditioning();
    }

    @Override
    public IWashingMachine createWashingMachine() {
        return new XiaoMiWashingMachine();
    }
}
