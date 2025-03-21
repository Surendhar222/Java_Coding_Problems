package String_Practice;

import java.util.Stack;

public class StringDecodeUsingStack {
	public static void main(String[] args) {
        String str = "((X){2}(y){3}(z)){2}";
        Stack<Integer> stk = new Stack<>();
        Stack<StringBuilder> stk2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (char c : str.toCharArray()) {
            if(c == '(' || c == ')'){continue;}
            if(c >= '1' && c <= '9'){
                num = num * 10 + (c - '0');
                stk.push(num);
                stk2.push(sb);
                num = 0;
                sb = new StringBuilder();
            }
            else if(c == '}'){
                String s = new String(sb);
               // System.out.println(s);
                int k = stk.pop();
                sb = stk2.pop();
                for(int i = 0 ; i < k ; i++){
                    sb.append(s);
                }  
                stk2.push(sb); 
                sb = new StringBuilder();
            }
            else{
                sb.append(c);
                System.out.println(sb);
            }
        }
        System.out.println(sb);
    }
}