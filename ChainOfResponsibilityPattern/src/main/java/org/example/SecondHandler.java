package org.example;

import java.util.Objects;
import java.util.Scanner;

/**
 * @className：FirstHandler
 * @Author: ckyforever
 * @Date: 2022/9/10 22:49
 */
public class SecondHandler extends Handler{
    @Override
    public boolean doHandler() {
        System.out.println("这是第二次面试");
        System.out.println("3、以下对接口描述错误的是（ ）\n" +
                "\n" +
                "A.接口没有提供构造方法\n" +
                "\n" +
                "B.接口中的方法默认使用public、abstract修饰\n" +
                "\n" +
                "C.接口中的属性默认使用public、static、final修饰\n" +
                "\n" +
                "D.接口不允许多继承");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        return Objects.equals(res, "D");
    }
}
