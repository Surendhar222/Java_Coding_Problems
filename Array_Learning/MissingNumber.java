package Array_Learning;

public class MissingNumber {
	public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int i = 0;
        while (i < arr.length) {
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr , arr[i] , i);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                System.out.println(j);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}