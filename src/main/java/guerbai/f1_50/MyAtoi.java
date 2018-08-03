package guerbai.f1_50;

public class MyAtoi {

    private static int myAtoi(String str) {
        boolean negative = false;
        boolean noZeroOccur = false;
        StringBuilder resultStringBuilder = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==' ' && !noZeroOccur) {
                continue;
            }
            if (!noZeroOccur && str.charAt(i)=='-') {
                negative = true;
            } else if (!noZeroOccur && str.charAt(i)=='+') {
                negative = false;
            } else if (!noZeroOccur && "1234567890".indexOf(str.charAt(i))<0) {
                return 0;
            } else if (!noZeroOccur && "123456789".indexOf(str.charAt(i))>=0) {
                resultStringBuilder.append(str.charAt(i));
            } else if (noZeroOccur && "1234567890".indexOf(str.charAt(i))<0) {
                break;
            } else {
                resultStringBuilder.append(str.charAt(i));
            }
            noZeroOccur = true;
        }
        if (resultStringBuilder.length()==0) {
            resultStringBuilder.append('0');
        }
        if (negative) {
            resultStringBuilder.insert(0, '-');
        }
        int frontZeroLength = 0;
        for (int i=0; i<resultStringBuilder.length(); i++, frontZeroLength++) {
            if (i==0 && "+-".indexOf(resultStringBuilder.charAt(i))>=0) continue;
            if (resultStringBuilder.charAt(i)!='0') break;
        }
        if (resultStringBuilder.length()-frontZeroLength>11) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        long resultLong = Long.parseLong(resultStringBuilder.toString());
        return resultLong>Integer.MAX_VALUE ? Integer.MAX_VALUE :
                resultLong<Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) resultLong;
    }

    public static void main(String[] args) {
        String s = "  0000000000012345678";
        System.out.println(myAtoi(s));

    }
}
