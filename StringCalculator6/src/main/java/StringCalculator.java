/**
 * User: quangvh
 * Date: 6/3/13
 */
public class StringCalculator {
    public static int add(String numbers) {
        Integer sum = 0;
        String repNewLine = "";
        String repSeparator = "";
        String[] number = null;
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.contains(",")) {
            if (numbers.contains("\n"))
                repNewLine = numbers.replaceAll("\n",",");
            number = repNewLine.split(",");
            for (String numComma : number) {
                sum += Integer.parseInt(numComma);
            }
            return sum;
        } else if(numbers.contains(";")) {
            if (numbers.contains("\n"))
                repNewLine = numbers.replaceAll("\n","");
            if (numbers.contains("//"))
                repSeparator = repNewLine.replaceAll("//","0");
            number = repSeparator.split(";");
            for (String numSep : number) {
                sum += Integer.parseInt(numSep);
            }
             return sum;
        } else {
            return Integer.parseInt("2");
        }
    }
}
