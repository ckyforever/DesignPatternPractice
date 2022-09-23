package org.example.oa;

import java.util.Objects;
import java.util.Scanner;

/**
 * @className：FirstHandler
 * @Author: ckyforever
 * @Date: 2022/9/10 22:49
 */
public class SecretaryHandler extends OAHandler {
    int day = 7;

    @Override
    public void handler(int day) {
        if (doHandler()) {
            System.out.println("院书记请假成功");
        } else {
            System.out.println("院书记请假失败");
        }

    }

    @Override
    public boolean doHandler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("院书记审批  yes 通过 no 不通过");
        String val = scanner.nextLine();
        if (val.equals("no")) {
            return false;
        } else if (val.equals("yes")) {
            return true;
        }
        return false;
    }
}
