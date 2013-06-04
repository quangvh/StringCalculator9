/**
 * User: quangvh
 * Date: 6/4/13
 */
public class Calculator {
    public static int add(String numbers) {
        String[] listDelimiter = {",",";","#"};
        String[] number = null;
        String repNewLine = null;
        String repSeparator = null;
        Integer sum = 0;
        Boolean checkOneNum = false;
        if (numbers.isEmpty()) {
            return 0;
        } else {
            for (String delimiter : listDelimiter) {
                if (numbers.contains(delimiter)) {
                    checkOneNum = true;
                    repNewLine = numbers.replaceAll("\n",delimiter);
                    repSeparator = repNewLine.replaceAll("//",delimiter);
                    number = repSeparator.split(delimiter);
                    for (String num : number) {
                        if (num.length() > 0) {
                            if (Integer.parseInt(num) < 0) {
                                try {
                                    throw new NegativeNumberException("negatives not allowed " + num);
                                } catch (NegativeNumberException e) {
                                }
                                return -1;
                            } else {
                                sum += Integer.parseInt(num);
                            }
                        }
                    }
                    break;
                }
            }
            if (!checkOneNum) {
                return Integer.parseInt(numbers);
            } else {
                return sum;
            }
        }
    }
}
