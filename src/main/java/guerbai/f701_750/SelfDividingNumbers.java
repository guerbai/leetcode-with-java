package guerbai.f701_750;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public Boolean isSelfDividing(int n) {
        String ns = Integer.toString(n);
        for (int i=0; i<ns.length(); i++) {
            int d = Character.getNumericValue(ns.charAt(i));
            if (d == 0) {
                return false;
            }
            if (n % d != 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();        
        for (int i=left; i<right+1; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }
}