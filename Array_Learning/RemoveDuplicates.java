package Array_Learning;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int j = 1;
        for (int i = 0; i < arr.length && j < arr.length; i++) {
            if(arr[i] == arr[j]){
                swap(arr , j , j+1);
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
