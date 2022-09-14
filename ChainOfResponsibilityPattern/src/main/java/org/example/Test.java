package org.example;

/**
 * @className： Test
 * @Author: ckyforever
 * @Date: 2022/9/10 23:04
 */
public class Test {
    public static void main(String[] args) {
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();

        firstHandler.connection(secondHandler).connection(thirdHandler);

        firstHandler.handler();

    }
}
