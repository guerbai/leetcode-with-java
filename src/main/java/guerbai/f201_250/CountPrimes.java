package guerbai.f201_250;

public class CountPrimes {

    private static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i=i+2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static int countPrimes(int n) {
        int count = 0;
        for (int i=1; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static int fastCountPrimes(int n) {
        boolean[] cache = new boolean[n];
        int count = 0;
        for (int i=2; i < n; i++) {
            if (!cache[i]) {
                count++;
                for (int j=1; j*i<n; j++) {
                    cache[j*i] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
//        countPrimes(n);
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
        System.out.println(isPrime(9));
        System.out.println(isPrime(10));
    }
}
