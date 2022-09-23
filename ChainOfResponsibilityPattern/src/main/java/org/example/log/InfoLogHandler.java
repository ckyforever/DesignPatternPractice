package org.example.log;

/**
 * @className：InfoLogHandler
 * @Author: ckyforever
 * @Date: 2022/9/18 12:16
 */
public class InfoLogHandler extends LogHandler{
    @Override
    public void doHandler(String type, String message) {
        if(type.equals("Info")) {
            System.out.println("Info Log:" + message);
        }
    }
}
