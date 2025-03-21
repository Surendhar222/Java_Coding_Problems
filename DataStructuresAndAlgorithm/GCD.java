package DataStructuresAndAlgorithm;

public class GCD {
	public static void main(String[] args) {
        int a = 15 , b = 20;
        gcdBruteForce(a, b);  // O(min(a , b)) similarly O(n)
        gcdEuclidAlgo(a , b); // O(max(a , b)) 
        optimizedEuclidApproach(a , b); // O(log(max(a , b)))
    }

    public static void optimizedEuclidApproach(int a ,  int b){
        while (a != 0 && b != 0) {
            if(a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if (a != 0) {
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }

    public static void gcdEuclidAlgo(int a , int b){
        while (a != b) {
            if (a > b) {
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        System.out.println(a);
    }
    public static void gcdBruteForce(int a , int b){
         int min = 0;
        if(a < b){
            min = a;
        }
        else{
            min = b;
        }

        for (int i = min; i >= 1 ; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}