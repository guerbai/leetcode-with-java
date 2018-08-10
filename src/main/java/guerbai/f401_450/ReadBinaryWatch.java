package guerbai.f401_450;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class ReadBinaryWatch {

    // 关键在于Integer.bitCount()
    private static List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for (int h=0; h<12; h++) {
            for (int m=0; m<60; m++) {
                if (Integer.bitCount(h)+Integer.bitCount(m)==num) {
                    result.add(String.format("%d:%2d", h, m));
                }
            }
        }
        return result;
    }
}
