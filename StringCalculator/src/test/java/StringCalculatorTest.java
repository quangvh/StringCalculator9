import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: quangvh
 * Date: 5/27/13
 */
public class StringCalculatorTest {
    @Test
    public void stringReturnEmpty(){
        assertEquals(0, StringCalculator.add(""));
    }

    /*@Test
    public void stringReturnOne(){
        assertEquals(1, StringCalculator.add());
    }*/

}
