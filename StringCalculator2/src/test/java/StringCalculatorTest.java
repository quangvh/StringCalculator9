import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: quangvh
 * Date: 5/28/13
 */
public class StringCalculatorTest {
    @Test
    public void stringReturnZeroNumber() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void stringReturnOneNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void stringReturnTwoNumber() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void stringReturnUnknownAmountOfNumber() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }

    @Test
    public void stringReturnNewLinesOkNumber() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
}
