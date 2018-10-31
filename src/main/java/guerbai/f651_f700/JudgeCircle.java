package guerbai.f651_f700;

public class JudgeCircle {

    private static boolean judgeCircle(String moves) {
        int dl = 0;
        int du = 0;
        for (char c: moves.toCharArray()) {
            if (c == 'L') {
                dl++;
            }
            if (c == 'R') {
                dl--;
            }
            if (c == 'U') {
                du++;
            }
            if (c == 'D') {
                du--;
            }
        }
        return dl == 0 && du == 0;
    }

}