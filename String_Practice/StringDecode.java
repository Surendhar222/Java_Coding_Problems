package String_Practice;

public class StringDecode {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "3[a]2[bc]";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '['){
                int num = s.charAt(i-1) - 48;
                sb.append(func(s , num , i+1));
            }
        }
        System.out.println(sb);
    }

    private static StringBuilder func(String s, int num , int index) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = index; i < s.length(); i++) {
            if(s.charAt(i) != ']'){
                sb.append(s.charAt(i));
            }
            else
                break;
        }
        for (int i = 0; i < num; i++) {
            sb1.append(sb);
        }
        return sb1;
    }
}



