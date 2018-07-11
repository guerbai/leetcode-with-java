package guerbai.hundredone_to_hundredfifty;

import java.util.ArrayList;
import java.util.List;

public class Yanghui1 {

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        result.add(row1);
        for (int i=1; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<i+1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    System.out.println(i);
                    System.out.println(j);
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        int numRows = 5;
        generate(5);
    }
}
