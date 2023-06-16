import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void test1() {
        Assert.assertEquals(Main.calc("1+2"),"3");

    }

    @Test
    public void test5() {
        Assert.assertThrows(RuntimeException.class,()->Main.calc("1") );

    }
    @Test
    public void test6() {
        Assert.assertThrows(RuntimeException.class,()->Main.calc("1+2+3") );

    }
}
