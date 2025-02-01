package classwork.day22;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({MyTestngListener.class})
public class TestRailTest {

    @Test(description = "158028")
    public void testCase1() {
        int expected = 1;
        int actual = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "158032")
    public void testCase2() {
        int expected = 10;
        int actual = 10;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "158034")
    public void testCase3() {
        int expected = 11;
        int actual = 11;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "158036")
    public void testCase4() {
        int expected = 1;
        int actual = 10;
        Assert.assertEquals(actual, expected);
    }
}
