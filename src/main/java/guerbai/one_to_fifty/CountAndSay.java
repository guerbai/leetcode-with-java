package guerbai.one_to_fifty;

public class CountAndSay {

    private static String countAndSay(int n) {
        String result = "1";
        while (n > 1) {
            StringBuilder nextResultSB = new StringBuilder();
            char pre = result.charAt(0);
            int preCount = 1;
            for (int i=1; i<result.length(); i++) {
                if (result.charAt(i)==pre) {
                    preCount++;
                } else {
                    nextResultSB.append(Integer.toString(preCount));
                    nextResultSB.append(pre);
                    pre = result.charAt(i);
                    preCount = 1;
                }
            }
            nextResultSB.append(Integer.toString(preCount));
            nextResultSB.append(pre);
            result = nextResultSB.toString();
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
