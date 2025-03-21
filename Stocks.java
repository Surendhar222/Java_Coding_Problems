/*Given an array are denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.

Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.

Examples:

Input: arr[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210 Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655 Maximum Profit  = 210 + 655 = 865
Input: arr[] = [4, 2, 2, 2, 4]
Output: 2
Explanation: Buy the stock on day 3 and sell it on day 4 => 4 – 2 = 2*/

public class Stocks {
	public static void main(String[] args) {
       int[] arr = {400 , 700 , 100 , 50 , 10 , 1001};
       //betterSoln(arr);
       optimumSoln(arr);
    }
    public static void betterSoln(int arr[]){
        int i = 0 , n = arr.length;
        int result = 0;
        int min = arr[0] , max = arr[0];
        while(i < n-1){
            while(i < n-1 && arr[i] >= arr[i+1]){i++;}
            min = arr[i];
            while(i < n-1 && arr[i] <= arr[i+1]){i++;}
            max = arr[i];
            result += max - min;
        }
        System.out.println(result);
    }
    public static void optimumSoln(int[] arr){
        int result = 0;
        for(int i = 1 ; i < arr.length ; i++){
                if(arr[i] > arr[i-1])
            result += arr[i] - arr[i-1];
        }
        System.out.println(result);
    }
}