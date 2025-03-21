import java.util.Scanner;
public class Vowels {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scan.next();
        //char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            sb.append(c);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                sb.append((char) (c - 32));
            }
            else if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                sb.append((char) (c + 32));
            }
        }
        System.out.println(sb.toString());
    }
}