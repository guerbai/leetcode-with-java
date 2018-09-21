package guerbai.f651_f700;

import java.util.ArrayList;
import java.util.List;

public class CalPoints {

    private static int calPoints(String[] ops) {
        List<Integer> validScore = new ArrayList<>();
        int score = 0;
        for (String op: ops) {
            if (!"C".equals(op)) {
                int addScore;
                if ("D".equals(op)) {
                    addScore = validScore.get(validScore.size()-1) * 2;
                } else if ("+".equals(op)) {
                    addScore = validScore.get(validScore.size()-1) + validScore.get(validScore.size()-2);
                } else {
                    addScore = Integer.parseInt(op);
                }
                score += addScore;
                validScore.add(addScore);
            } else {
                int removedScore = validScore.remove(validScore.size()-1);
                score -= removedScore;
            }
        }
        return score;
    }
}
