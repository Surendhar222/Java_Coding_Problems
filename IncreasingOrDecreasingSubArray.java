public class IncreasingOrDecreasingSubArray {
	public static void main(String[] args) {
        int[] arr = {3,2,1};
        int maxLength = 1;
        int incLength = 1;
        int decLength = 1;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[i-1]){
                incLength++;
               // decLength = 1;
            }
            else if(arr[i] < arr[i-1]){
                decLength++;
              //  incLength = 1;
            }
            else{
                incLength = 1;
                decLength = 1;
            }
            maxLength = Math.max(maxLength,Math.max(incLength, decLength));
        }
        System.out.println(maxLength);
    }
}