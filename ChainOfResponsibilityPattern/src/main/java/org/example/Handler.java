package org.example;


/**
 * @className： Handle
 * @Author: ckyforever
 * @Date: 2022/9/10 22:44
 */
public abstract class Handler {
    private Handler nextHandler;

    public Handler connection(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public void handler() {
        Boolean isPass = this.doHandler();
        if (isPass) {
            if (nextHandler != null) nextHandler.handler();
            else System.out.println("你通过面试了");
        } else {
            System.out.println("你面试失败了");
        }
    }

    public abstract boolean doHandler();
}