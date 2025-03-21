/*Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/

package Array_Learning;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
	public static void main(String[] args) {
      BruteForce();
      optimizedSolnUsingPrefixSufixArrays();



    }
    public static void optimizedSolnUsingPrefixSufixArrays(){
        int[] arr = {1 , 2 , 3 , 4};
        int n = arr.length;
        int[] temp = new int[n];
        temp[0] = 1; 
        for (int i = 1; i < arr.length; i++) {
            temp[i] = arr[i-1] * temp[i -1];
        }

        int sum = 1;
        for (int i = n-2; i >= 0; i--) {
            sum = sum * arr[i+1];
            temp[i] *= sum;
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void BruteForce(){
          int[] arr = {-1,1,0,-3,3};
        int[] temp = new int[arr.length];
        int i = 0 ;
        while(i < arr.length){
            int ans = 1;
            int j = 0;
            while(j < arr.length){
                if(i != j){
                     ans = ans * arr[j];
                }
                j++;
            }
            temp[i] = ans;
            i++;
        }
        System.out.println(Arrays.toString(temp));
    }
}