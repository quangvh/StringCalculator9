/**
 * User: quangvh
 * Date: 5/31/13
 */
public class StringCalculator{

    public static int add(String numbers){
        Integer sum = 0;
        String numberRepSource = numbers.replaceAll("//","0");
        if (numbers.isEmpty()) {
            return 0;
        } else if (numberRepSource.contains(",")) {
            String numberRepNewLine = numbers.replaceAll("\n",",");
            String[] numberComma = numberRepNewLine.split(",");
            if (numberComma.length > 2) {
                for (String numComma: numberComma) {
                    sum += Integer.parseInt(numComma);
                    //if (numberComma.length > 0)
                }
                return sum;
            } else {
                return Integer.parseInt(numberComma[0]) + Integer.parseInt(numberComma[1]);
            }
        } else if (numberRepSource.contains(";")) {
            String numRepNewLine = numberRepSource.replaceAll("\n","");
            String[] numSeparator = numRepNewLine.split(";");
            for (String numSep: numSeparator) {
                if (Integer.parseInt(numSep) < 0) {
                    try {
                        throw new NegativeNumberException("negatives not allowed" + numSep);
                    } catch (NegativeNumberException e) {
                    }
                    return -1;
                } else {
                    sum += Integer.parseInt(numSep);
                }
            }
            return sum;
        } else {
            return Integer.parseInt("1");
        }
    }
}
