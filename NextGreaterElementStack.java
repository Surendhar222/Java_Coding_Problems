import java.util.*;

public class NextGreaterElementStack {
	public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 3};
         Stack<Integer> stk = new Stack<>();
       // Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 2*arr.length-1 ; i >=0 ; i--){
            while(!stk.isEmpty() && arr[i % n] >= stk.peek()){
                stk.pop();
            }
            if(i < n){
                if(!stk.isEmpty()){
                    ans[i] = stk.peek();
                }
                else{
                    ans[i] = -1;
                }
            }
            stk.push(arr[i % n]);
        }
        System.out.println(Arrays.toString(ans));
        System.out.println("hii");
        for(int a : ans){
            System.out.print(a + " ");
        }
    }
}