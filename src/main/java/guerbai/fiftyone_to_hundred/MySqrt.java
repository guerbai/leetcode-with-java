package guerbai.fiftyone_to_hundred;

public class MySqrt {

    private static int mySqrt(int x) {
        double result = 1;
        double delta = 0.000001;
        while (Math.abs(result*result-x) > delta) {
            result = 0.5*(x/result+result);
        }
        return (int) Math.ceil(result);
    }
}
