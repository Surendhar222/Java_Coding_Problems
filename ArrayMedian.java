// Find median of two sorted Arrays.

import java.util.Arrays;

public class ArrayMedian {
	public static void main(String[] args){
        int[] arr = {1,3};
        int[] brr = {2,5,6};
        median(arr , brr);
    }
    public static void median(int[] arr , int[] brr){
        int n = arr.length + brr.length , i = 0 , j = 0;
        int mid1 = -1 , mid2 = -1;
        for(int count = 0 ; count <= n/2 ; count++){
            mid2 = mid1;
            if(i != arr.length && j != brr.length){
                mid1 = (arr[i] > brr[j]?brr[j++]:arr[i++]);
            }
            if(i < arr.length){
                mid1 = arr[i++];
            }else{
                mid1 = brr[j++];
            }
        }
         if(n % 2 == 1){
                System.out.println(mid1);
            }
            else{
                System.out.println(((double)mid1+mid2)/2);
            }
    }
}