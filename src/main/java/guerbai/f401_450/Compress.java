package guerbai.f401_450;

public class Compress {

    private static int compress(char[] chars) {
        if (chars.length == 0) return 0;
        int result = 0;
        char lastchar = chars[0];
        int lastCharCount = 1;
        int modifyIndex = 0;
        for (int i=1; i<chars.length; i++) {
            if (chars[i] == lastchar) {
                lastCharCount++;
            } else {
                String countString = Integer.toString(lastCharCount);
                result += 1 + (lastCharCount > 1 ? countString.length() : 0);
                chars[modifyIndex] = lastchar;
                modifyIndex++;
                if (!"1".equals(countString)) {
                    for (char c: countString.toCharArray()) {
                        chars[modifyIndex] = c;
                        modifyIndex++;
                    }
                }
                lastchar = chars[i];
                lastCharCount = 1;
            }
        }
        String countString = Integer.toString(lastCharCount);
        result += 1 + (lastCharCount > 1 ? countString.length() : 0);
        chars[modifyIndex] = lastchar;
        modifyIndex++;
        if (!"1".equals(countString)) {
            for (char c: countString.toCharArray()) {
                chars[modifyIndex] = c;
                modifyIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }
}
