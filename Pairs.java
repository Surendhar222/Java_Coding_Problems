import java.util.ArrayList;
import java.util.List;

public class Pairs {
	public static void main(String[] args) {
        
        List<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
        int[] arr = {10 , 5 , 7 , 6};
        int target = 35;
        for(int i = 0 ; i < arr.length ; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] * arr[j] == target){
                    list.add(arr[i]);
                    list.add(arr[j]);
                    break;
                }
            }
            bucket.add(list);
        }
        System.out.println(bucket);
    }
}
