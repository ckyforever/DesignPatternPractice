package org.example.log;

/**
 * @className：Main
 * @Author: ckyforever
 * @Date: 2022/9/18 12:22
 */
public class Main {
    public static void main(String[] args) {
        InfoLogHandler infoLogHandler = new InfoLogHandler();
        WarningLogHandler warningLogHandler = new WarningLogHandler();
        ErrorLogHandler errorLogHandler = new ErrorLogHandler();

        LogChain logChain = new LogChain();
        logChain.addLogHandler(infoLogHandler);
        logChain.addLogHandler(warningLogHandler);
        logChain.addLogHandler(errorLogHandler);

        logChain.log("Info","info message");
        logChain.log("Warning","warning message");
        logChain.log("Error","error message");
        logChain.log("special","this is a special message");

    }
}
