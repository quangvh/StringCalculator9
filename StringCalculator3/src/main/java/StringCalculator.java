/**
 * User: quangvh
 * Date: 5/29/13
 */
public class StringCalculator { ////;\n1;2

    public static int add(String numbers) {
        Integer sum = 0;
        if (numbers.isEmpty()){
            return 0;
        } else if (numbers.contains(",")) {
            String[] number = numbers.split(",");
            if (number.length > 2) {
                for (int i = 0; i < number.length; i++) {
                    sum += Integer.parseInt(number[i]);
                }
                return sum;
            }else {
                if (number[0].contains("\n")) {
                    String[] newLine = number[0].split("\n");
                    return Integer.parseInt(newLine[0]) + Integer.parseInt(newLine[1]) + Integer.parseInt(number[1]);
                } else {
                    return Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
                }
            }
        } else if (numbers.contains("/") || numbers.contains("\n")) {
            String numSeperator = numbers.replaceAll("/","");
            String numNewLine = numSeperator.replaceAll("\n","");
            String seperator = numNewLine.replaceAll(";",",");

            String[] sep = seperator.split(",");
            for (String s: sep) {
                sum += Integer.parseInt(s);
            }
            return sum;
        }
        else {
            return Integer.parseInt("1");
        }
    }
}
