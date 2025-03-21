package Array_Learning;
import java.util.Arrays;
public class ZigZagConversion {
	public static void main(String[] args) {
        String s = "ThisisaZigzag";
        int numRows = 4;
         char[][] ch = new char[numRows][s.length()];
        // for(int i = 0 ; i < numRows ; i++){
        //     for(int j = 0 ; j < s.length() ; j++){
        //         ch[i][j] = ' ';
        //     }
        // }
        for (char[] cs : ch) {
            Arrays.fi
        }
        boolean direction = true;
        int row = 0 , idx = 0;
        for(int col = 0 ; col < s.length() ; col++){
            if(direction && row < numRows){
                ch[row++][col] = s.charAt(idx++);
            }
            if (!direction && row >= 0) {
                ch[row--][col] = s.charAt(idx++);
            }
            if(row == numRows-1 || row == 0){
                direction = !direction;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                sb.append(ch[i][j]);
            }
        }
        System.out.println(sb);
    }
}