public class Matrix_Diagonal {
	public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int n = arr.length;
        int itr = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            int row = i , col = n-1;
            while(row < n && col > itr){
                System.out.print(arr[row][col] +" ");
                col--;
            }
            itr++;
        }
        
        for (int i = arr.length-1; i >= 0 ; i--) {
            int row = i , col = 0;
            while(row >= 0 && col < n){
                System.out.print(arr[row][col] +" ");
                row--;
                col++;
            }
        }
    }
}