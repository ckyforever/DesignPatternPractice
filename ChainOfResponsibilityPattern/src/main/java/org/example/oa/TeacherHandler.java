package org.example.oa;

import javax.swing.text.html.Option;
import java.util.Scanner;

/**
 * @className：FirstHandler
 * @Author: ckyforever
 * @Date: 2022/9/10 22:49
 */
public class TeacherHandler extends OAHandler {

    int day = 1;

    @Override
    public void handler(int day) {
        if(day > this.day) {
            if(doHandler()) {
                System.out.println("班主任审批成功");
                if(nextHandler != null) nextHandler.handler(day);
            } else {
                System.out.println("班主任审批失败");
            }
        } else {
            if(doHandler()) {
                System.out.println("班主任请假成功");
            } else {
                System.out.println("班主任请假失败");
            }
        }
    }

    @Override
    public boolean doHandler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("班主任审批  yes 通过 no 不通过");
        String val = scanner.nextLine();
        if(val.equals("no")) {
            return false;
        } else if(val.equals("yes")) {
            return true;
        }
        return false;
    }
}
