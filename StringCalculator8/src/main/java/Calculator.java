/**
 * User: quangvh
 * Date: 6/5/13
 */
public class Calculator {
    public static int add(String numbers) {
        Integer sum = 0;
        String[] number = null;
        String repNewLine = null;
        String delimiter = null;
        String separator = null;
        if (numbers.isEmpty()) {
            return 0;
        } else {
            if (numbers.contains("//")) {
                delimiter = numbers.substring(2, 3);
                separator = numbers.substring(2);
                repNewLine = separator.replaceAll("\n", delimiter);
            } else if (numbers.contains(",")) {
                delimiter = ",";
                repNewLine = numbers.replaceAll("\n", delimiter);
            } else {
                return Integer.parseInt(numbers);
            }
            number = repNewLine.split(delimiter);
            for (String num : number) {
                if (num.length() > 0){
                    if (Integer.parseInt(num) < 0) {
                        try {
                            throw new NegativeNumberException("negatives not allowed " + num);
                        } catch (NegativeNumberException e) {
                        }
                        return -1;
                    }
                    sum += Integer.parseInt(num);
                }
            }
            return sum;
        }
    }
}
