package ZohoQuestions.Tharuvai_Team;

import java.util.Scanner;

public class Diagonal_Difference {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for row and colums");
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        // logic
        int left = 0 , right = 0;
        int col = arr.length-1;
        for (int row = 0; row < arr.length; row++) {
            left += arr[row][row];
            right += arr[row][col];
            col--;
        }
        if (left > right) {
            System.out.println(left - right);
        }
        else{
            System.out.println(right - left);
        }
    }
}