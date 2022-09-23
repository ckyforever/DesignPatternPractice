package org.example.log;

/**
 * @className：WarningLogHander
 * @Author: ckyforever
 * @Date: 2022/9/18 12:18
 */
public class WarningLogHandler extends LogHandler{
    @Override
    public void doHandler(String type, String message) {
        if(type.equals("Warning")) {
            System.out.println("Warning Log" + message);
        }
    }
}
