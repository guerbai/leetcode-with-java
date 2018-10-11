package guerbai.f151_200;

import java.util.*;

public class LargestNumber {

    private class StringNumComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            String order1 = o1 + o2;
            String order2 = o2 + o1;
            return order2.compareTo(order1);
        }
    }

    private String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for (int i=0; i<nums.length; i++) {
            s[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(s, new StringNumComparator());
        StringBuilder sb = new StringBuilder();
        for (String str: s) {
            sb.append(str);
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }

}
