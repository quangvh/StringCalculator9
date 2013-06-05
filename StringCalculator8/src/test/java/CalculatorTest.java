import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: quangvh
 * Date: 6/5/13
 */
public class CalculatorTest {
    @Test
    public void testStringEmpty() {
        assertEquals(0, Calculator.add(""));
    }
    @Test
    public void testStringOneNumber() {
        assertEquals(1, Calculator.add("1"));
    }
    @Test
    public void testStringTwoNumber() {
        assertEquals(3, Calculator.add("1,2"));
    }
    @Test
    public void testStringUnknownAmountNumber() {
        assertEquals(15, Calculator.add("1,2,3,4,5"));
    }
    @Test
    public void testStringNewLine() {
        assertEquals(6, Calculator.add("1\n2,3"));
    }
    @Test
    public void testStringSeparatorFirst() {
        assertEquals(3, Calculator.add("//#\n1#2"));
    }
    @Test(expected = NegativeNumberException.class)
    public void testStringNavigateNumber() throws NegativeNumberException {
        int num = Calculator.add("-1, -3");
        if (num < 0) {
            throw new NegativeNumberException("");
        }
    }
}
