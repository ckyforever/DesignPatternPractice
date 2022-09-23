package org.example.log;

import java.lang.reflect.Type;

/**
 * @className：ErrorLogHandler
 * @Author: ckyforever
 * @Date: 2022/9/18 12:14
 */
public class ErrorLogHandler extends LogHandler{
    @Override
    public void doHandler(String type, String message) {
        if(type.equals("Error")) {
            System.out.println("Error Log:" + message);
        }
    }
}
