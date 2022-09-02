import org.example.CounterDCL;
import org.example.CounterHungry;
import org.example.CounterLazy;
import org.junit.Assert;
import org.junit.Test;

/**
 * @className：OneThreadTest
 * @Author: ckyforever
 * @Date: 2022/9/2 12:11
 */
public class OneThreadTest {
    @Test
    public void counterHungryTest() {
        for(int i = 0;i < 10;i ++) {
            CounterHungry.getInstance().online();
        }
        Assert.assertEquals(10,CounterHungry.getInstance().getOnline());
    }

    @Test
    public void counterLazyTest() {
        for(int i = 0;i < 10;i ++) {
            CounterLazy.getInstance().online();
        }
        Assert.assertEquals(10,CounterLazy.getInstance().getOnline());
    }

    @Test
    public void counterDLCTest() {
        for(int i = 0;i < 10;i ++) {
            CounterDCL.getInstance().online();
        }
        Assert.assertEquals(10, CounterDCL.getInstance().getOnline());
    }

}
