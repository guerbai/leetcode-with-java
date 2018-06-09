package guerbai.one_to_fifty;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder result = new StringBuilder();
        int sLen = s.length();
        for (int i=0; i<numRows; i++) {
            if (i>0 && i<numRows-1) {
                int j=0;
                int nextIndex1 = i+j*(numRows+numRows-2);
                int nextIndex2 = (j+1)*(numRows+numRows-2)-i;
                while (nextIndex1<sLen) {
                    result.append(s.charAt(nextIndex2));
                    if (nextIndex2<sLen) {
                        result.append(s.charAt(nextIndex2));
                    }
                    j++;
                    nextIndex1 = i+j*(numRows+numRows-2);
                    nextIndex2 = (j+1)*(numRows+numRows-2)-i;
                }
            } else {
                int j=0;
                int nextIndex = i+j*(numRows+numRows-2);
                while (nextIndex<sLen) {
                    result.append(s.charAt(nextIndex));
                    j++;
                    nextIndex = i+j*(numRows+numRows-2);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));

    }
}
