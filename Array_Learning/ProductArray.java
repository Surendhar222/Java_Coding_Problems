package Array_Learning;

import MyArrays.MyArrays;

public class ProductArray {
	public static void main(String[] args){
        int[] arr = {0,2,0,4};
        int[] temp = new int[arr.length];
        int i = 0  , ans = 1;
        while(i < arr.length){
            int j =0;
            ans = 1;
            while (j<arr.length) {
                if(i != j){
                    ans = ans * arr[j];
                }
                j++;
            }
            temp[i] = ans;
            i++;
        }
        System.out.println(MyArrays.toString(temp));
    }
}