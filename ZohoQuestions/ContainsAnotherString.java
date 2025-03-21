package ZohoQuestions;

public class ContainsAnotherString {
	public static void main(String[] args) {
        String txt = "Geeksforgeeks";
        String pat = "for";
        int len = pat.length();
        for(int i = 0 ; i < txt.length() ; i++){
            if(txt.charAt(i) == pat.charAt(0)){
                if(txt.substring(i , i+len).equals(pat)){
                    System.out.println(i);
                }
            }
        }
        System.out.println(-1);
    }
}