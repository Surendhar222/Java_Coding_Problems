public class Kadane_Algorithm {
	public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0 , max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}