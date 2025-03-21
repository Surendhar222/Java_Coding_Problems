package Array_Learning;

public class MissingFirstPosNum {
	public static void main(String[] args) {
        int[] arr = {3 , 1 , 5 , 2};
        int j = 1 , ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(found(arr , arr[i]+1 , arr[i]-1) == 0){
                if(ans > arr[i]+1 && arr[i]+1 > 0){
                    ans = arr[i]+1;
                }
            }
        }
        System.out.println(ans);
    }
    private static int found(int[] arr , int a , int b){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            if(arr[i] != a && arr[i] > 0){
                flag = true;
            }
            // if (arr[i] != b && arr[i] > 0){
            //     return 
            // }
        }
        return -1;
    }
}