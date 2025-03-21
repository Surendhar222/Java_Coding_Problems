/*Input: arr[] = [7, 9, 1, 3, 5], target = 6
Output: true
Explanation: arr[2] and arr[4] has sum equals to 6 which is equal to the target.*/

package ZohoQuestions;

import java.util.Arrays;

public class Pair_Sum {

	public static void main(String[] args) {
        int[] array = {2, 3, 4, 1};
        int target = 7;
        //bruteForce(array , target);
        betterApproach(array , target);
    }

    private static void betterApproach(int[] array, int target) {

        sort(array , 0 , array.length-1);
        System.out.println(Arrays.toString(array));

        int left = 0 , right = array.length-1;

        while (left < right) {

            int sum = array[left] + array[right];
            if (sum == target) {
                System.out.println(true);
                break;
            }
            else if (sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
    }

    private static void bruteForce(int[] array, int target) {
        
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            int j = i+1;
            while (j < array.length) {
                if (array[i] + array[j] == target) {
                    System.out.println(true);
                    flag = true;
                    break;
                }
                j++;
            }
            if (flag) {
                break;
            }
        }
    }

    private static void sort(int[] array , int start , int end){

        if (start < end) {
            int partion =  findPartition(array , start , end);
            sort(array, start, partion-1);
            sort(array, partion+1, end);
        }
    }

    private static int findPartition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if(pivot > array[j]){
                i++;
                swap(array , i , j);
            }
        }
        swap(array, i+1 , end);
        return i+1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}