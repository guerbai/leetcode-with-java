package guerbai.fiftyone_to_hundred;

public class PlusOne {

    private static int[] plusOne(int[] digits) {
        int arraySizePlusOne = 1;
        for (int i=0; i<digits.length; i++) {
            if (digits[i] != 9) {
                arraySizePlusOne = 0;
                break;
            }
        }
        int[] result = new int[digits.length+arraySizePlusOne];
        int addOne = 0;
        for (int i=digits.length-1; i>-1; i--) {
            int thisPointNum;
            if (i==digits.length-1) {
                thisPointNum = digits[i] + 1 + addOne;
            } else {
                thisPointNum = digits[i] + addOne;
            }
            if (thisPointNum==10) {
                addOne = 1;
                result[i+arraySizePlusOne] = 0;
            } else {
                result[i+arraySizePlusOne] = thisPointNum;
                addOne = 0;
            }
        }
        if (addOne==1) result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(plusOne(digits));
    }
}
