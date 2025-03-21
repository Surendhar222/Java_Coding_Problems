/*Input: Hexadecimal = 1AC5
Output: Binary = 0001101011000101
Explanation:
    Equivalent binary value of 1: 0001
    Equivalent binary value of A: 1010
    Equivalent binary value of C: 1100
    Equivalent binary value of 5: 0101

Input: Hexadecimal = 5D1F
Output: Binary = 0101110100011111*/

package ZohoQuestions;

public class hexaToBinary {
    public static void main(String[] args) {
	    String num = "1AC5" , temp = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == 'A' || num.charAt(i) == 'B' || num.charAt(i) == 'C' || num.charAt(i) == 'D' || num.charAt(i) == 'E' || num.charAt(i) == 'F') {
                if(num.charAt(i) == 'A'){
                    temp+="10";
                }
                if(num.charAt(i) == 'B'){
                    temp+="11";
                }
                if(num.charAt(i) == 'C'){
                    temp+="12";
                }
                if(num.charAt(i) == 'D'){
                    temp+="13";
                }
                if(num.charAt(i) == 'E'){
                    temp+="14";
                }
                if(num.charAt(i) == 'F'){
                    temp+="15";
                }
            }
            else{
                temp += ""+num.charAt(i);
            }
        }
        System.out.println(temp);
        String binary = "";
        for (int i = 0; i < temp.length(); i++) {
            int x = temp.charAt(i) % 2;
            binary = x + binary;
        }
        System.out.println(binary);
    }
}