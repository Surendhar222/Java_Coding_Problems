package DataStructuresAndAlgorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,9,2,5,7,1,6,8,3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr , int start , int end){
        if (start < end) {
            int partion = findPartition(arr , start , end);
            quickSort(arr, start, partion-1);
            quickSort(arr, partion+1, end);
        }
    }
    public static int findPartition(int[] arr , int start , int end){
        int pivot = arr[end];
        int i = (start - 1);
        for (int j = start ; j < end ; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr , i , j);
            }
        }
        swap(arr, i+1 , end);
        return i+1;
    }
    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}