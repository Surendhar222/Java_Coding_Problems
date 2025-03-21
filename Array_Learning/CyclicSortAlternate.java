package Array_Learning;

import java.util.ArrayList;
import java.util.List;

public class CyclicSortAlternate {
	public static void main(String[] args) {
        int[] nums = {3,4,1,4};
        boolean[] arr = new boolean[nums.length+1];
        List<Integer> list = new ArrayList<Integer>();
        for(int a : nums){
            arr[a] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if(!arr[i]){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}