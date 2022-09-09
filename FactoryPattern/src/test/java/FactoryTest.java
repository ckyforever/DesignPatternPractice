import org.example.factory.IProductFactory;
import org.example.factory.impl.HaierFactory;
import org.example.factory.impl.XiaoMiFactory;
import org.junit.Test;

/**
 * @className：FactoryTest
 * @Author: ckyforever
 * @Date: 2022/9/9 12:06
 */
public class FactoryTest {
    @Test
    public void haierFactoryTest() {
        IProductFactory haierFactory = new HaierFactory();
        haierFactory.createAirConditioning().introduct();
        haierFactory.createWashingMachine().introduct();
    }

    @Test
    public void xiaoMiFactoryTest() {
        IProductFactory xiaoMiFactory = new XiaoMiFactory();
        xiaoMiFactory.createAirConditioning().introduct();
        xiaoMiFactory.createWashingMachine().introduct();
    }
}
