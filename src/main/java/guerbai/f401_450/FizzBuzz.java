package guerbai.f401_450;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i=1; i<n+1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }
}
