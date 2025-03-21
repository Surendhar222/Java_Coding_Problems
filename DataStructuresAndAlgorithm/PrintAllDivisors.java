package DataStructuresAndAlgorithm;

public class PrintAllDivisors {
	public static void main(String[] args) {
        int n = 25;
       // bruteForce(n);    // Time Complxity -> O(n)
        optimizedSoln(n);   // Time Complexity -> O(sqrt(n))
    }
    public static void optimizedSoln(int n) {
        int i = 0;
        for (i = 1; i * i <= n ; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for ( ; i >= 1 ; i--) {
            if (n % i == 0 && i != n/i) {
                 System.out.println(n/i);
            }
        }
    }
    public static void bruteForce(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}