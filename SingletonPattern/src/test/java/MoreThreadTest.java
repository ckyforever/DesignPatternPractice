import org.example.CounterDCL;
import org.example.CounterHungry;
import org.example.CounterLazy;
import org.junit.Assert;
import org.junit.Test;

/**
 * @className：MoreThreadTest
 * @Author: ckyforever
 * @Date: 2022/9/2 12:28
 */
public class MoreThreadTest {
    @Test
    public void counterHungryTest() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                CounterHungry.getInstance().online();
                //System.out.println(CounterHungry.getInstance().getOnline());
            }).start();
        }
        Thread.sleep(1000L);
        Assert.assertEquals(100, CounterHungry.getInstance().getOnline());
    }

    @Test
    // 懒汉单例多次线程测试
    public void counterLazyTest() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                CounterLazy.getInstance().online();
            }).start();
        }
        Thread.sleep(1000L);
        Assert.assertNotEquals(100, CounterLazy.getInstance().getOnline());
    }

    @Test
    // 双校验锁多线程测试
    public void counterDClTest() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                CounterDCL.getInstance().online();
                //System.out.println(CounterDCL.getInstance().getOnline());
            }).start();
        }
        Thread.sleep(1000L);
        Assert.assertEquals(100, CounterDCL.getInstance().getOnline());
    }
}
