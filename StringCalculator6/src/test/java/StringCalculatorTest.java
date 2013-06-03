import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: quangvh
 * Date: 6/3/13
 */
public class StringCalculatorTest {
    @Test
    public void stringEmptyTest() {
        assertEquals(0, StringCalculator.add(""));
    }
    @Test
    public void stringOneNumberTest() {
        assertEquals(2, StringCalculator.add("2"));
    }
    @Test
    public void stringTwoNumberTest() {
        assertEquals(5, StringCalculator.add("2,3"));
    }
    @Test
    public void stringUnknownAmountNumberTest() {
        assertEquals(45, StringCalculator.add("1,2,3,4,5,6,7,8,9"));
    }
    @Test
    public void stringNewLineTest() {
        assertEquals(10, StringCalculator.add("1\n2,3\n4"));
    }
    @Test
    public void stringSeparatorTest() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
}
