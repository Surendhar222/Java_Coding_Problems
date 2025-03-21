/*Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
  Output: [1,4,2,7,5,3,8,6,9]*/
package Array_Learning;

import java.util.Arrays;

public class DiagonalTraversal {
	public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[] ans = new int[arr.length*arr[0].length];
        int idx = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            int row = i , col = 0;
            while(row >= 0 && col <= i){
             ans[idx++] = arr[row--][col++];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            int row = arr.length-1 , col = i;
            while (col < arr.length) {
                ans[idx++] = arr[row--][col++];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}