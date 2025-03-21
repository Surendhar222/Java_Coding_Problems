package DataStructuresAndAlgorithm;

public class LCM {
	public static void main(String[] args) {
        int a = 3 , b = 7;
        lcmBruteForce(a , b); // Time Complexity -> O(a*b - max(a , b))
        lcmUsingGcdOptimized(a , b);
    }

    public static void lcmUsingGcdOptimized(int a , int b){
        //Find GCD Using Eculid algo
        int t1 = a , t2 = b;
        while (a != 0 && b != 0) {
            if(a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        int gcd = 0;
        if(a != 0){
            gcd = a;
        }
        else{
            gcd = b;
        }
        System.out.println((t1*t2)/gcd);
    }
    public static void lcmBruteForce(int a , int b){
        int result = Math.max(a , b);
        while (true) {
            if(result % a == 0 && result %  b == 0){
                System.out.println(result);
                break;
            }
            result++;
        }
    }
}