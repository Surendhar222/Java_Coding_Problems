package Array_Learning;

public class PatternDiamond {
	public static void main(String[] args) {
        int n = 5 , num = 1;
        for (int i = 1; i <= 2*n; i++) {
            if (i <= n) {
                for (int j = n; j > i ; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
                if (i > n) {
                    for (int j = n+1; j < i ; j++) {
                        System.out.print(" ");
                    }
                    for (int j = num++; j <= n; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
        }
    }
}