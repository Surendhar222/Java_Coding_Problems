package ZohoQuestions.Tharuvai_Team;

import java.util.Scanner;

public class Apples_Oranges {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the house Range ... (Eg : 4   7)");
        int s = scan.nextInt();
        int t = scan.nextInt();

        System.out.println("Enter the Apple and Orange Trees invidual Ranges ... (Eg : 2   10)");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Enter the number of Fruits for Apples and Oranges ... (Eg : Apple : 3   Orange : 4)");
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[] apples = new int[m];
        System.out.println("Enter the Apples distance");
        for (int i = 0; i < apples.length; i++) {
            apples[i] = scan.nextInt();
        }

        int[] Oranges = new int[n];
        System.out.println("Enter the Oranges distance");
        for (int i = 0; i < Oranges.length; i++) {
            Oranges[i] = scan.nextInt();
        }
        int appleCount = 0 , OrangeCount = 0;
        for (int i = 0; i < apples.length; i++) {
            if (a + apples[i] >= s) {
                appleCount++;
            }
        }
        for (int i = 0; i < Oranges.length; i++) {
            if (b + Oranges[i] <= t) {
                OrangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(OrangeCount);
    }
}