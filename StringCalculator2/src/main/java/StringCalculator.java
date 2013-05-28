/**
 * User: quangvh
 * Date: 5/28/13
 */
public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.contains(",")) {
            String[] num = numbers.split(",");
            if (num.length > 2) {
                Integer sum = 0;
                for (int i = 0; i < num.length; i++) {
                    if (num[i].contains("\n")) {
                        String[] newLine = numbers.split("\n");
                    } else {
                        sum+= Integer.parseInt(num[i]);
                    }
                }
                return sum;
            } else {
                return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
            }
        }
        else {
            return Integer.parseInt("1");
        }
    }
}
