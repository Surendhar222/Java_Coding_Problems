package ZohoQuestions.Tharuvai_Team;

import java.util.Arrays;

public class Find_MissingNums {
	public static void main(String[] args) {
        int[] brr = {203 ,204 ,205 ,206, 207, 208, 203, 204, 205, 206};
        int[] arr = {203 , 204 ,204, 205, 206 ,207, 205 ,208 ,203 ,206, 205, 206 ,204};
        sort(arr , 0 , arr.length-1);
        sort(brr , 0 , brr.length-1);

        int[] answer = new int[Math.abs(arr.length - brr.length)];

        int i = 0 , j = 0 , idx = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] == brr[j]) {
                // answer[idx++] = arr[i];
                i++;
                j++;
            }else if(arr[i] < brr[j]){
                answer[idx++] = arr[i];
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(Arrays.toString(answer));
    }

    private static void sort(int[] arr , int start , int end) {
        if (start < end) {
            int partition = findPartion(arr , start , end);
            sort(arr, start, partition-1);
            sort(arr, partition+1, end);
        }
    }

    private static int findPartion(int[] arr, int start, int end) {       
        int pivot = arr[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot){
                i++;
                swap(arr , i , j);
            }       
        }
        swap(arr, i+1, end);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
