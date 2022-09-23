package org.example.log;

import java.util.ArrayList;
import java.util.List;

/**
 * @className：LogChain
 * @Author: ckyforever
 * @Date: 2022/9/18 12:19
 */
public class LogChain {
    private List<LogHandler> logHandlerChain = new ArrayList<LogHandler>();

    public void addLogHandler(LogHandler logHandler) {
        logHandlerChain.add(logHandler);
    }

    public void log(String type,String message) {
        for (LogHandler handler : logHandlerChain) {
            handler.doHandler(type, message);
        }
    }
}
