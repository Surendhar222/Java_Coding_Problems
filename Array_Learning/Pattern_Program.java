package Array_Learning;

public class Pattern_Program {
	public static void main(String[] args) {
        String s = "program";
        int mid = s.length()/2;
        int spaces = (s.length()*2)-2;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length() ; i++) {
            for (int j = 0 ; j < spaces ; j++) {
                System.out.print(" ");
            }
            if (mid < s.length()) {
                sb.append(s.charAt(mid++));
                System.out.print(sb);
            }
            if (mid == s.length()) {
                mid = 0;
            }
            System.out.println();
            spaces-= 2;
        }
    }
}