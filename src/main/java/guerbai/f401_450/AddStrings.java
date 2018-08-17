package guerbai.f401_450;

public class AddStrings {

    private static String addStrings(String num1, String num2) {
        int jinwei = 0;
        int rIndex = 0;
        StringBuilder resultSB = new StringBuilder();
        while (num1.length()-rIndex>0 && num2.length()-rIndex>0) {
            int num1AtRIndex = Character.getNumericValue(num1.charAt(num1.length()-rIndex-1));
            int num2AtRIndex = Character.getNumericValue(num2.charAt(num2.length()-rIndex-1));
            int rIndexNum = num1AtRIndex + num2AtRIndex + jinwei;
            if (rIndexNum > 9) {
                jinwei = 1;
            } else {
                jinwei = 0;
            }
            resultSB.append(rIndexNum%10);
            rIndex++;
        }
        String num;
        if (num1.length() - rIndex > 0) {
            num = num1;
        } else if (num2.length() - rIndex > 0){
            num = num2;
        } else {
            num = "";
        }
        while (num.length() - rIndex > 0) {
            int numAtRIndex = Character.getNumericValue(num.charAt(num.length()-rIndex-1));
            int rIndexNum = numAtRIndex + jinwei;
            if (rIndexNum > 9) {
                jinwei = 1;
            } else {
                jinwei = 0;
            }
            resultSB.append(rIndexNum%10);
            rIndex++;
        }
        if (jinwei == 1) {
            resultSB.append('1');
        }
        return resultSB.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "408";
        String num2 = "5";
        System.out.println(addStrings(num1, num2));
    }
}
