package String_Practice;

import java.util.Stack;

public class kPairs {
	public static void main(String[] args) {
        String s = "PoGgoOp";
        int[] arr = new int[150];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < 'a'){
                arr[s.charAt(i) - 'A']++;
            }
            else if(s.charAt(i) > 'Z'){
                arr[(s.charAt(i)-' ') - 'A']++;
            }
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                flag = true;
                System.out.println((char)(i+'A'));
            }
        }
        if(!flag){
            System.out.println(-1);
        }
    }
}