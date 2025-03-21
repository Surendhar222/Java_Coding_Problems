/*Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1*/
public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
        int[] arr = {0,1,0,3,2,3};
        int count = 0 , j = 1;
        for (int i = 0; i < arr.length && j < arr.length; i++) {
            if (arr[i] < arr[j]) {
                System.out.println(arr[i]);
                count++;
            }
            if (j == arr.length-1 && arr[i] > arr[j]) {
                count++;
                System.out.println(arr[i]);
            }
            j++;
        }
        //if(arr[arr.length-1] < arr[arr.length-2]){count++;}
        System.out.println(count);
    }
}