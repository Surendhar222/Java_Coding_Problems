package String_Practice;

public class LongestPalindromeSubString {
	public static void main(String[] args) {
        String s = "racecarmalayalam";
        String temp = "";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(ch[i]);
            for (int j = i+1; j < ch.length; j++) {
                sb.append(ch[j]);
                if(ch[i] == ch[j]){
                    boolean flag = check(s , i , j);
                    if(flag && sb.length() > temp.length()){
                        temp = sb.toString();
                    }
                }
            }
        }
        System.out.println(temp);
    }

    private static boolean check(String s, int start, int end) {
        StringBuilder sb = new StringBuilder(s);
        while (start <= end) {
            if(sb.charAt(start) != sb.charAt(end)){
               return false;
            }
            start++;
            end--;
        }
        return true;
    }
}