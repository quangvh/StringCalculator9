import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: quangvh
 * Date: 6/4/13
 */
public class CalculatorTest {
    @Test
    public void stringEmptyTest() {
        assertEquals(0, Calculator.add(""));
    }
    @Test
    public void stringOneNumberTest() {
        assertEquals(1, Calculator.add("1"));
    }
    @Test
    public void stringTwoNumberTest() {
        assertEquals(3, Calculator.add("1,2"));
    }
    @Test
    public void stringUnknownAmountNumberTest() {
        assertEquals(15, Calculator.add("1,2,3,4,5"));
    }
    @Test
    public void stringNewLineTest() {
        assertEquals(6, Calculator.add("1\n2,3"));
    }
    @Test
    public void stringChangeDelimiterTest() {
        assertEquals(3, Calculator.add("//#\n1#2"));
    }
    @Test(expected = NegativeNumberException.class)
    public void stringNegativeNumberTest() throws NegativeNumberException{
        int num = Calculator.add("-1,-3");
        if (num < 0) {
            throw new NegativeNumberException("");
        }
    }

}
