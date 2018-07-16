package guerbai.onefiveone_to_twozerozero;

public class ConvertToTitle {
    private static char intToChar(int a) {
        return (char)(65 + a);
    }

    private static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n = n - 1;
            sb.insert(0, intToChar(n % 26));
            n = n / 26;
        }
        return sb.toString();
    }
}
