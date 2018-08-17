package guerbai.f401_450;

public class ToHex {

    private static char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    // 相应地，8进制，4进制，2进制的补码方案，都可以这么处理。
    private static String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(l[num & 15]);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
