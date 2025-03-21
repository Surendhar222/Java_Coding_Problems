package DataStructuresAndAlgorithm;

public class PrimeFactors {
	public static void main(String[] args) {     // Time Complexity -> O(sqrt(n)logn)
        int n = 13;
        int i = 2;
        while (i*i <= n) {
            while (n % i == 0) {
            System.out.println(i);
            n = n / i;
            }
            i++;
        }
        if (n > 1) {    
            System.out.println(n);
        }
    }
}