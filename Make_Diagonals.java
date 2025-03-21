import java.util.Arrays;

public class Make_Diagonals {
	public static void main(String[] args) {
        int n = 10 , num = 1;;
        int[][] arr = new int[n][n];
        int row = 0;
        int col = 0;
        while(row < n){
            col = row;
            row = 0;
            while(col >=0){
                arr[row][col] = num++;
                row++;
                col--;
            }
        }
      row = 1; 
        while(row < n){
          int i=row;
            col = n-1;
            while (col >= 0 && i<n) {
                arr[i][col] = num++;
                i++;
                col--;
            }
            row++;
        }

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
}