package guerbai.f451_500;

public class FindComplement {

    private static int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<32; i++) {
            sb.append('0');
        }
        boolean began = false;
        String numstr = Integer.toBinaryString(num);
        StringBuilder nsb = new StringBuilder(numstr);
        while (nsb.length() < 32) {
            nsb.insert(0, '0');
        }
        for (int i=0; i<nsb.length(); i++) {
            if (nsb.charAt(i) == '0' && began)  {
                sb.setCharAt(i, '1');
            } else if (nsb.charAt(i) == '1' && began) {
                sb.setCharAt(i, '0');
            } else if (nsb.charAt(i) == '1' && !began) {
                began = true;
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
