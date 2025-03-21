package ZohoQuestions;

import java.util.Arrays;

public class MoveDuplicates {
	public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,4};
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) {
               move(arr , i);
            }
        }   
    }

    private static void move(int[] arr, int i) {
        int last = arr[i];
        for (int j = i; j < arr.length-1; j++) {
            arr[j] = arr[j+1];
        }
        arr[arr.length-1] = last;
    }
}