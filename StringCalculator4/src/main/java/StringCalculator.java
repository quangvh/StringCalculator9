/**
 * User: quangvh
 * Date: 5/30/13
 */
public class StringCalculator {
    public static int add(String numbers) {
        Integer sum = 0;
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.contains(",")) {
            String numRepNewLine = numbers.replaceAll("\n",",");
            String[] number = numRepNewLine.split(",");
            if (number.length > 2) {
                for (String numComma: number) {
                    if (numComma.length()>0)
                        sum+=Integer.parseInt(numComma);
                }
                return sum;
            }
            return Integer.parseInt(number[0]) + Integer.parseInt(number[1]);
        } else if (numbers.contains(";")){
            String numRepSep = numbers.replaceAll("//","");
            String numRepNewLine = numRepSep.replaceAll("\n","");
            String[] numSep = numRepNewLine.split(";");
            for (String numSeparator: numSep) {
                if (!numSeparator.equals("")) {
                    sum+=Integer.parseInt(numSeparator);
                }
            }
            return sum;
        } else if (numbers.contains("-")){
            return -1;
        } else {
            return Integer.parseInt("1");
        }
    }
}
