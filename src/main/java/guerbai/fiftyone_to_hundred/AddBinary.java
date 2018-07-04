package guerbai.fiftyone_to_hundred;

public class AddBinary {

    private static int count1(char... addChars) {
        int count = 0;
        for (char i: addChars) {
            if (i=='1') {
                count++;
            }
        }
        return count;
    }

    private static String addBinary(String a, String b) {
        char addOne = '0';
        String longStr, shortStr;
        if (a.length() < b.length()) {
            longStr = b;
            shortStr = a;
        } else {
            longStr = a;
            shortStr = b;
        }
        char[] resultArray = new char[longStr.length()+1];
        int i=0;
        for (; i<shortStr.length(); i++) {
            int longIndex = longStr.length() - i - 1;
            int shortIndex = shortStr.length() - i - 1;
            int count = count1(longStr.charAt(longIndex), shortStr.charAt(shortIndex), addOne);
            if (count == 3) {
                addOne = '1';
                resultArray[longIndex+1] = '1';
            } else if (count == 2) {
                addOne = '1';
                resultArray[longIndex+1] = '0';
            } else if (count == 1) {
                addOne = '0';
                resultArray[longIndex+1] = '1';
            } else if (count == 0) {
                addOne = '0';
                resultArray[longIndex+1] = '0';
            }
        }
        for (; i<longStr.length(); i++) {
            int index = longStr.length() - i - 1;
            int count = count1(longStr.charAt(index), addOne);
            if (count == 2) {
                addOne = '1';
                resultArray[index+1] = '0';
            } else if (count == 1) {
                addOne = '0';
                resultArray[index+1] = '1';
            } else if (count == 0) {
                addOne = '0';
                resultArray[index+1] = '0';
            }
        }
        if (addOne == '1') resultArray[0] = '1';
        StringBuilder sb = new StringBuilder();
        for (int arrayIndex=0; arrayIndex<resultArray.length; arrayIndex++) {
            if (arrayIndex==0 && resultArray[arrayIndex] == 0) {
                continue;
            }
            sb.append(resultArray[arrayIndex]);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a = "111";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}
