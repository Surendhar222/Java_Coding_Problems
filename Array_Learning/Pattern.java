package Array_Learning;

import java.util.Arrays;

public class Pattern {
	public static void main(String[] args) {
        String s = "waterss";
        char[][] arr = new char[s.length()][s.length()];
        for (char[] cs : arr) {
            Arrays.fill(cs, ' ');
        }

        int col = 0 , idx = 0 , mid = s.length()/2;
        for (int row = 0; row < arr.length; row++) {
            arr[row][row] = s.charAt(idx);
            arr[row][mid] = s.charAt(idx);
            arr[mid][row] = s.charAt(idx++);
        }

        col = arr.length-1;
        idx = s.length()-1;
        for (int row = 0; row < arr.length; row++) {
            arr[row][col--] = s.charAt(idx--);
        }

        for (char[] cs : arr) {
            System.out.println(Arrays.toString(cs));
        }
    }
}