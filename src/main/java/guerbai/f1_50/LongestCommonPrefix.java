package guerbai.f1_50;

public class LongestCommonPrefix {

    private static String logestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        if (strs.length==0) return sb.toString();
        while (true) {
            if (strs[0].length()<=index) return sb.toString();
            char s = strs[0].charAt(index);
            for (String str: strs) {
                if (str.length()<=index || str.charAt(index)!=s) {
                    return sb.toString();
                }
            }
            sb.append(s);
            index++;
        }
    }
}
