package Array_Learning;

public class HallowDiamondPattern {
	public static void main(String[] args) {
       int n = 9;
       int outerSpace = n/2;
       int innerSpace = 1;
       for(int i = 0 ; i < n ; i++){
        for (int j = 0; j < outerSpace ; j++) {
            System.out.print(" ");
        }
        if (i < n/2) {
            outerSpace -= 1;
        }
        else{
            outerSpace += 1;
        }
        if (i == 0 || i == n-1) {
            System.out.println("*");
        }
        else{
           System.out.print("*");
           for (int j = 0; j < innerSpace ; j++) {
             System.out.print(" ");
           }
           
           if (i < n/2) {
            innerSpace += 2;
           }
           else
            innerSpace -= 2;

            System.out.println("*");
        }
       }
    }
}