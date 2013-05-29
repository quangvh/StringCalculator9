import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: quangvh
 * Date: 5/29/13
 */
public class StringCalculatorTest {
    @Test
    public void stringZeroTest() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void stringOneTest() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void stringTwoTest() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void stringUnknownAmountTest() {
        assertEquals(25, StringCalculator.add("1,3,5,7,9"));
    }

    @Test
    public void stringNewLinesTestOk() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void stringBeginSeperatorTest() {
        assertEquals(3, StringCalculator.add(("//;\\n1;2")));
    }
}
