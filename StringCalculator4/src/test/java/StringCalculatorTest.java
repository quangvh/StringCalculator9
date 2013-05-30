import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: quangvh
 * Date: 5/30/13
 */
public class StringCalculatorTest {
    @Test
    public void stringEmptyTest(){
        assertEquals(0, StringCalculator.add(""));
    }
    @Test
    public void stringHaveOneNumberTest(){
        assertEquals(1, StringCalculator.add("1"));
    }
    @Test
    public void stringHaveTwoNumberTest(){
        assertEquals(3, StringCalculator.add("1,2"));
    }
    @Test
    public void stringHaveUnknownAmountNumberTest() {
        assertEquals(30, StringCalculator.add("2,4,6,8,10"));
    }
    @Test
    public void stringContainsNewLineTest() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
    @Test
    public void stringContainsSeparatorTest() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
    @Test
    public void stringNegativeNumberTest() {
        assertEquals(-1, StringCalculator.add("-1"));
    }
}
