package org.example.oa;

import java.util.Scanner;

/**
 * @className： Test
 * @Author: ckyforever
 * @Date: 2022/9/10 23:04
 */
public class Test {
    public static void main(String[] args) {
        OAHandler firstHandler = new TeacherHandler();
        OAHandler secondHandler = new CounselorHandler();
        OAHandler thirdHandler = new SecretaryHandler();

        firstHandler.connection(secondHandler).connection(thirdHandler);

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        firstHandler.handler(day);

    }
}
