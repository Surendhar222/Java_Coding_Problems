/*Given an array nums of n integers where nums[i] is in the range [1, n], 
return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2] */

package Array_Learning;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearNums {
	public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int i = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (i < arr.length) {
            int correct = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != correct){
                swap(arr , arr[i] , correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(i != arr[i]){
                list.add(i);
            }
        }
        System.out.println(list);
    }

    private static void swap(int[] arr, int i, int j) {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
}