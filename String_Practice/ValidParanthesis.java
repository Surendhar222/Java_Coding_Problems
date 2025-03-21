package String_Practice;
import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "()[]{}";
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
            stk.push(str.charAt(i));
            }
            if(str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}'){
                stk.pop();
            }
        }
        System.out.println(stk.isEmpty());
    }
}