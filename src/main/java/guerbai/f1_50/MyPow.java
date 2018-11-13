package guerbai.f1_50;

public class MyPow {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -2147483648) {
            if (x == 1) {
                return 1;
            }
            if (x == -1) {
                return 1;
            }
            return 0;
        }
        if (n < 0) {
            x = 1/x;
            n = -n;
        }
        if (n % 2 == 1) {
            return x * myPow(x, n-1);
        } else {
            return myPow(x * x, n / 2);
        }        
    } 

}