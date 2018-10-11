package guerbai.f551_600;

public class CheckRecord {

    private static boolean checkRecord(String s) {
        int al = 0;
        int cll = 0;
        boolean prel = false;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == 'A') {
                al += 1;
                if (al > 1) return false;
                prel = false;
            } else if (prel && s.charAt(i) == 'L') {
                cll += 1;
                if (cll > 2) return false;
                prel = true;
            } else if (s.charAt(i) == 'L'){
                prel = true;
                cll = 1;
            } else {
                prel = false;
                cll = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "LLLALL";
        System.out.println(checkRecord(s));
    }
}
