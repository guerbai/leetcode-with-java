package guerbai.f101_150;

import java.util.ArrayList;
import java.util.List;

public class Yanghui2 {

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i=1; i<rowIndex+1; i++) {
            for (int j=i; j>-1; j--) {
                if (j == i) {
                    result.add(1);
                } else if (j == 0) {
                    result.set(j, 1);
                } else {
                    result.set(j, result.get(j) + result.get(j-1));
                }
            }
        }
        return result;
    }
}
