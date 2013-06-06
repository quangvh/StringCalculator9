import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * User: quangvh
 * Date: 6/6/13
 */
public class CalculatorTest {
    @Test
    public void testStringEmpty() throws Exception{
        assertEquals(0, Calculator.add(""));
    }
    @Test
    public void testStringOneNumber() throws Exception{
        assertEquals(1, Calculator.add("1"));
    }
    @Test
    public void testStringTwoNumber() throws Exception{
        assertEquals(3, Calculator.add("1,2"));
    }
    @Test
    public void testStringUnknownAmountNumber() throws Exception{
        assertEquals(15, Calculator.add("1,2,3,4,5"));
    }
    @Test
    public void testStringNewLine() throws Exception{
        assertEquals(6, Calculator.add("1\n2,3"));
    }
    @Test
    public void testChangeDelimiter() throws Exception{
        assertEquals(3, Calculator.add("//;\n1;2"));
    }
    @Test
    public void testNegativeNumberException() {
        try {
            Calculator.add("-1,-2");
            fail("Number exception");
        } catch (Exception e) {
            assertEquals(e.getMessage(),"negatives not allowed: -1 -2");
        }
    }
    @Test
    public void testStringMoreThanOneThousand() throws Exception{
        assertEquals(2, Calculator.add("2,1001"));
    }
    /*@Test
    public void testCustomDelimiter() throws Exception{
        assertEquals(6, Calculator.add("//[***]\n1***2***3"));
    }*/
}
