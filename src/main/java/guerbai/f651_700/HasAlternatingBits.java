package guerbai.f651_700;

public class HasAlternatingBits {

    private static boolean hasAlternatingBits(int n) {
        String ns = Integer.toBinaryString(n);
        if (ns.length() == 1) return true;
        char lastChar = ns.charAt(0);
        for (int i=1; i<ns.length(); i++) {
            if (ns.charAt(i) == lastChar) {
                return false;
            }
            lastChar = ns.charAt(i);
        }
        return true;
    }
}
