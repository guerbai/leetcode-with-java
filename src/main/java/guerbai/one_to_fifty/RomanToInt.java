package guerbai.one_to_fifty;

public class RomanToInt {

    private static int romanToInt(String s) {
        int index = s.length() - 1;
        int qianWei = 0;
        int baiWei = 0;
        int shiWei = 0;
        int geWei = 0;
        while (index>=0) {
            if (index>0 && s.substring(index-1, index+1).equals("IV")) {
                geWei += 4;
                index--;
            } else if (index>0 && s.substring(index-1, index+1).equals("IX")) {
                geWei += 9;
                index--;
            } else if (index>0 && s.substring(index-1, index+1).equals("XL")) {
                shiWei += 4;
                index--;
            } else if (index>0 && s.substring(index-1, index+1).equals("XC")) {
                shiWei += 9;
                index--;
            } else if (index>0 && s.substring(index-1, index+1).equals("CD")) {
                baiWei += 4;
                index--;
            } else if (index>0 && s.substring(index-1, index+1).equals("CM")) {
                baiWei += 9;
                index--;
            } else if (s.charAt(index)=='I') {
                geWei += 1;
            } else if (s.charAt(index)=='V') {
                geWei += 5;
            } else if (s.charAt(index)=='X') {
                shiWei += 1;
            } else if (s.charAt(index)=='L') {
                shiWei += 5;
            } else if (s.charAt(index)=='C') {
                baiWei += 1;
            } else if (s.charAt(index)=='D') {
                baiWei += 5;
            } else if (s.charAt(index)=='M') {
                qianWei += 1;
            }
            index--;
        }
        return qianWei*1000+baiWei*100+shiWei*10+geWei;
    }
}
