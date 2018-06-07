package guerbai.one_to_fifty;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        int sLen = s.length();
        int[][] indexCenter = new int[2*sLen-1][2];
        indexCenter[0] = new int[]{0, 0};
        indexCenter[indexCenter.length-1] = new int[]{sLen-1, sLen-1};
        for (int i=0; i<sLen; i++) {
            if (i==sLen-1) {
                continue;
            }
            if (i==0) {
                if (s.charAt(i)==s.charAt(i+1)) {
                    indexCenter[2*i+1][0] = 0;
                    indexCenter[2*i+1][1] = 1;
                }
                continue;
            }
            int l = i-1;
            int r = i+1;
            while (l>=0 && r<=sLen-1) {
                if (s.charAt(l)==s.charAt(r)) {
                    l -= 1;
                    r += 1;
                } else {
                    break;
                }
            }
            indexCenter[2*i][0] = l+1;
            indexCenter[2*i][1] = r-1;
            l = i;
            r = i+1;
            while (l>=0 && r<=sLen-1) {
                if (s.charAt(l)==s.charAt(r)) {
                    l -= 1;
                    r += 1;
                } else {
                    break;
                }
            }
            indexCenter[2*i+1][0] = l+1;
            indexCenter[2*i+1][1] = r-1;
            if (indexCenter[2*i+1][0]>indexCenter[2*i+1][1]) {
                indexCenter[2*i+1][0] = 0;
                indexCenter[2*i+1][1] = 0;
            }
        }
        int maxIndex = 0;
        int max = 1;
        for (int i=0; i<indexCenter.length; i++) {
            if (indexCenter[i][1]-indexCenter[i][0]+1>max) {
                maxIndex = i;
                max = indexCenter[i][1]-indexCenter[i][0];
            }
        }
        return s.substring(indexCenter[maxIndex][0], indexCenter[maxIndex][1]+1);
    }

    public static void main(String[] args) {
        String s = "ccc";
        System.out.println(longestPalindrome(s));
    }
}
