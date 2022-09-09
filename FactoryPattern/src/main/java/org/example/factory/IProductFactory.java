package org.example.factory;

import org.example.product.IAirConditioning;
import org.example.product.IWashingMachine;

/**
 * @className：IProductFactory
 * @Author: ckyfoever
 * @Date: 2022/9/9 11:54
 */
public interface IProductFactory {
    IAirConditioning createAirConditioning();
    IWashingMachine createWashingMachine();
}
