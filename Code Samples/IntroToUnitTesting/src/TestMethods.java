import org.junit.Assert;

public class TestMethods {

    @org.junit.Test
    public void isPositive() {
        Assert.assertTrue(UnitTestMe.isPositive(10));
        Assert.assertFalse(UnitTestMe.isPositive(-10));
    }

    @org.junit.Test
    public void isWhole() {
        Assert.assertTrue(UnitTestMe.isWhole(1));
        Assert.assertFalse(UnitTestMe.isWhole(1.234));
    }
}
