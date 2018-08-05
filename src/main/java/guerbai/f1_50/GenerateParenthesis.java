package guerbai.f1_50;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    private static void recursion(ArrayList<String> result, String now, int openLeft, int closeLeft) {
        boolean addToResult = openLeft == 0 && closeLeft == 0;
        boolean onlyAddOpen = openLeft==closeLeft;
        boolean addEitherOK = closeLeft > openLeft && openLeft > 0;
        boolean onlyAddClose = openLeft == 0 && closeLeft > 0;
        if (addToResult) {
            result.add(now);
        }
        if (onlyAddClose) {
            recursion(result, now+')', openLeft, closeLeft-1);
        } else if (onlyAddOpen) {
            recursion(result, now+"(", openLeft-1, closeLeft);
        } else if (addEitherOK) {
            recursion(result, now+"(", openLeft-1, closeLeft);
            recursion(result, now+")", openLeft, closeLeft-1);
        }
    }

    private static List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        recursion(result, "", n, n);
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));

    }
}
