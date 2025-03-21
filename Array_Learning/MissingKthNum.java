/*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. 
The 5th missing positive integer is 9.*/

package Array_Learning;

public class MissingKthNum {
	public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        for (int i : arr) {
            if(i <= k){
                k++;
            }
        }
        System.out.println(k);
    }
}