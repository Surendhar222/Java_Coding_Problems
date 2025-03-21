package Array_Learning;

public class SortUnsortedSubArray {
	public static void main(String[] args) {
        int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int start = 0 , end = arr.length , min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(start = 0 ; start < arr.length ; start++){
            if(arr[start] > arr[start+1]){
                break;
            }
        }
        for(end = arr.length-1 ; end >= 0 ; end--){
            if(arr[end] < arr[end-1]){
                break;
            }
        }
        for(int i = start ; i <= end ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0 ; i <= start ; i++){
            if(arr[i] > min){
                start = i;
                break;
            }
        }
        for(int i = arr.length-1 ; i >= 0 ; i--){
            if(arr[i] < max){
                end = i;
                break;
            }
        }
        System.out.println(start);
        System.out.println(end);
    }
}