import java.util.regex.Pattern;

/**
 * User: quangvh
 * Date: 6/6/13
 */
public class Calculator{
    public static int add(String numbers) throws Exception{
        Integer sum = 0;
        String[] number = null;
        String separator = null;
        String delimiter = null;
        String repNewLine = null;
        String negativeStr = "";
        if (numbers.isEmpty()) {
            return 0;
        } else {
            if (numbers.startsWith("//")) {
                //String textNumber = numbers.split("\n")[1]; //return 1***2***3

                delimiter = numbers.substring(2,3);
                separator = numbers.substring(2);
                repNewLine = separator.replaceAll("\n", delimiter);
            } else if (numbers.contains(",")) {
                delimiter = ",";
                repNewLine = numbers.replaceAll("\n", delimiter);
            } else {
                return Integer.parseInt(numbers);
            }
            number =repNewLine.split(delimiter);
            for (String num : number) {
                if (num.length() > 0 && Integer.parseInt(num) <= 1000) {
                    if (Integer.parseInt(num) < 0) {
                        negativeStr += " " + num;
                    }
                    sum += Integer.parseInt(num);
                }
            }
            if (!negativeStr.equals("")) {
                throw new Exception("negatives not allowed:" + negativeStr);
            }
            return sum;
        }
    }
}
