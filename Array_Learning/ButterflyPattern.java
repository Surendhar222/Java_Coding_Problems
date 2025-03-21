package Array_Learning;

public class ButterflyPattern {
	public static void main(String[] args) {
        int n = 5;
        //int n = s*2;
        int spaces = (n*2)-2;
        int stars = 1;
        
        for (int i = 1; i <= n*2; i++) {
           for (int j = 1; j <= stars; j++) {
            System.out.print('*');
           }
           for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");
           }
           for (int j = 1; j <= stars; j++) {
            System.out.print("*");
           }

           if(i < n){
            spaces -= 2;
            stars++;
           }
           if(i == n){
            stars = n;
            spaces = 0;
           }
           if(i > n){
            spaces += 2;
            stars--;
           }

           System.out.println();
        }
    }
}