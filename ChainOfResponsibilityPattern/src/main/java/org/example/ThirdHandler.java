package org.example;

import java.util.Objects;
import java.util.Scanner;

/**
 * @className：FirstHandler
 * @Author: ckyforever
 * @Date: 2022/9/10 22:49
 */
public class ThirdHandler extends Handler{
    @Override
    public boolean doHandler() {
        System.out.println("这是第三次面试");
        System.out.println("5、在try-catch-finally语句块中，以下可以单独与finally一起使用的是（）\n" +
                "\n" +
                "A. catch\n" +
                "B. try\n" +
                "C. throw\n" +
                "D.throws");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        return Objects.equals(res, "B");
    }
}
