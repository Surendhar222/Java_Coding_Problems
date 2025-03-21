package DataStructuresAndAlgorithm;

public class NumberOfPrimeNumbers {
	public static void main(String[] args) {          // Time Complexity -> O(squart(n)log(log(n)))
        int n = 50;
        boolean[] prime = new boolean[n+1];
        for (int i = 2; i * i < n; i++) {                   // First i <= n we can go i to n
                                                         // Next we can go square of n only enough(i*i < n)
            if (prime[i] == false) {
                for (int j = i*i ; j <= n ; j = j + i) { // first i * 2 -> fills 2's multiples
                    prime[j] = true;                     // Then i * i -> fils its square values(i = 2^2)(More Efficient)
                }
            }
        }
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] != true) {
                System.out.println(i);
            }
        }
    }
}