package org.example.oa;


/**
 * @className： Handle
 * @Author: ckyforever
 * @Date: 2022/9/10 22:44
 */
public abstract class OAHandler {
    protected OAHandler nextHandler;

    public OAHandler connection(OAHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void handler(int day);

    public abstract boolean doHandler();
}