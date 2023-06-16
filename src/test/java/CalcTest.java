import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void test1() {
        Assert.assertEquals(Main.calc("1+2"),"3");

    }

    @Test
    public void test2() {
        Assert.assertThrows(RuntimeException.class,()->Main.calc("1") );

    }
    @Test
    public void test3() {
        Assert.assertThrows(RuntimeException.class,()->Main.calc("1+2+3") );

    }
    @Test
    public void test4() {
        Assert.assertThrows(RuntimeException.class,()->Main.calc("3.5544+5.222") );

    }
}
