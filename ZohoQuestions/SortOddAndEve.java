/*Input: arr[] = [1, 2, 3, 5, 4, 7, 10]
Output: [7, 5, 3, 1, 2, 4, 10]
Explanation: 7 5 3 1 are odds in descending order and 2 4 10 are evens in ascending order.*/
package ZohoQuestions;

import java.util.Arrays;

public class SortOddAndEve {
	public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,7,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i]*-1;
                count++;
            }
        }
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i]*-1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] arr , int start , int end){
        if(start < end){
            int partition = findPartition(arr , start , end);
            quickSort(arr, start, partition-1);
            quickSort(arr, partition+1, end);
        }
    }
    private static int findPartition(int[] arr , int start , int end){
        int i = start-1;
        int pivot = arr[end];
        for (int j = start; j < end ; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr , i , j);
            }
        }
        swap(arr , i+1 , end);
        return i+1;
    }
    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}