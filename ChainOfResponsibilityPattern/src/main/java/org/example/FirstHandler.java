package org.example;

import java.util.Objects;
import java.util.Scanner;

/**
 * @className：FirstHandler
 * @Author: ckyforever
 * @Date: 2022/9/10 22:49
 */
public class FirstHandler extends Handler{
    @Override
    public boolean doHandler() {
        System.out.println("这是第一次面试");
        System.out.println("2、以下对重载描述错误的是（）\n" +
                "\n" +
                "A.方法重载只能发生在一个类的内部\n" +
                "\n" +
                "B.构造方法不能重载\n" +
                "\n" +
                "C.重载要求方法名相同，参数列表不同\n" +
                "\n" +
                "D.方法的返回值类型不是区分方法重载的条件");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        return Objects.equals(res, "B");
    }
}
