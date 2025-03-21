package ZohoQuestions.Tharuvai_Team;

import java.util.Scanner;

public class String_Delete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scan.nextInt();
        String[] array = new String[n];

        System.out.println("Enter the String Elements");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.next();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(check(array[i]));;;;;;
        }
    }

    private static int check(String str) {
        int deletions = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                deletions++;
            }
        }
        return deletions;
    }
}
