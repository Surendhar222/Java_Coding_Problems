public class Longest_Increasing_Subarray {
	public static void main(String[] args) {
        int[] arr = {5, 6, 3, 5, 7, 8, 9, 1,2,3,4,5,6,7,8,9,10};
        int count = 1 , max = 1 , maxIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                count++;
            }
            else{
                if(max < count){
                    max = count;
                    maxIndex = i - max;
                }
                count = 1;
            }
        }
            if(max < count){
                max = count;
                maxIndex = arr.length - max;
            }
            for (int j = maxIndex; j < max+maxIndex; j++) {
                System.out.print(arr[j]+" ");
            }
       // System.out.println(max);
    }
}