package DataStructuresAndAlgorithm;

public class PrimeNumbers {
	public static void main(String[] args) {
        int n = 11;
        System.out.println(isPrimeNumber(n));
        System.out.println(isPrimeNumberUsingSqrt(n));
    }

    public static boolean isPrimeNumberUsingSqrt(int n){
        if(n == 1){
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for (int i = 2; i*i < n; i+=6) {
            if(n % i == 0){
                return false;
            }
        }
            return true;
    }

    public static boolean isPrimeNumber(int n){
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0){
                return false;
            }
        }
            return true;
    }
}