/*Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"*/

package String_Practice;

import java.util.Arrays;
import java.util.Stack;

public class reverseLetters {
	public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        char[] ch = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int i = 0 , j = ch.length-1;
        while (i < j) {
            if (((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122 ))&& ((ch[j] >= 65 && ch[j] <= 90) || (ch[j] >= 97 && ch[j] <= 122))) {
                 char temp = ch[i];
                 ch[i] = ch[j];
                 ch[j] = temp;
                 i++;
                 j--;
            }
            else if(!((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122 ))){
                i++;
            }
            else if(!((ch[j] >= 65 && ch[j] <= 90) || (ch[j] >= 97 && ch[j] <= 122))){
                j--;
            }
            
        }
        for (int j2 = 0; j2 < ch.length; j2++) {
            sb.append(ch[j2]);
        }
        System.out.println(ch);
    }
}



