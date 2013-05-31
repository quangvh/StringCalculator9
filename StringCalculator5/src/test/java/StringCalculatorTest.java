import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * User: quangvh
 * Date: 5/31/13
 */
public class StringCalculatorTest {
    @Test
    public void stringEmptyTest() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void stringOneNumberTest() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void stringTwoNumberTest() {
        assertEquals(5, StringCalculator.add("2,3"));
    }

    @Test
    public void stringUnknownAmountNumberTest() {
        assertEquals(25, StringCalculator.add("1,3,5,7,9"));
    }

    @Test
    public void stringNewLineTest() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void stringSeparatorTest() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test(expected = NegativeNumberException.class)
    public void stringNegativeNumberTest() throws NegativeNumberException {
        int num = StringCalculator.add("-1,-2");
        if (num < 0) {
            throw new NegativeNumberException("");
        }
    }
}
