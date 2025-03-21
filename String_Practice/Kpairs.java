package String_Practice;

import java.util.Stack;

public class Kpairs {
	public static void main(String[] args) {
        String s = "PoGgoOp";
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for (int i = 1; i < s.length() && !stk.isEmpty(); i++) {
            if(stk.peek() == s.charAt(i)-' ' || stk.peek() == s.charAt(i)+' '){
                stk.pop();
            }
            else
                stk.push(s.charAt(i));
        }
        if(!stk.isEmpty()){
            System.out.println(stk);
        }
        else
            System.out.println(-1);
            
    }
}