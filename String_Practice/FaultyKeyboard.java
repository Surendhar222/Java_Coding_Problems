/*Input: s = "string"
Output: "rtsng"
Explanation: 
After typing first character, the text on the screen is "s".
After the second character, the text is "st". 
After the third character, the text is "str".
Since the fourth character is an 'i', the text gets reversed and becomes "rts".
After the fifth character, the text is "rtsn". 
After the sixth character, the text is "rtsng". 
Therefore, we return "rtsng".
Example 2:

Input: s = "poiinter"
Output: "ponter"*/

package String_Practice;

import java.util.Arrays;

public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "poiinter";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'i') {
                reverse(ch , i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != 'i'){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
    }
    private static void reverse(char[] ch , int i){
        int j = 0;
        while (j < i) {
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            j++;
            i--;
        }
    }
}
