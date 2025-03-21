package String_Practice;

public class DecodeWays{
/*Input: s = "12"
Output: 2
Explanation:
"12" could be decoded as "AB" (1 2) or "L" (12).

Example 2:
Input: s = "226"
Output: 3
Explanation:
"226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

Example 3:
Input: s = "06"
Output: 0*/

public static void main(String[] args){
    String str = "122016";
    int[] dp = new int[str.length()+1];
    dp[0] = 1;
    dp[1] = str.charAt(0) == '0'? 0 : 1;

    for (int i = 2; i <= str.length(); i++) {
        int oneDigit = Integer.parseInt(str.substring(i-1, i));
        int twoDigit = Integer.parseInt(str.substring(i-2 , i));
        if(oneDigit >= 1){
            dp[i] += dp[i-1];
        }
        if(twoDigit >= 10 && twoDigit <= 26){
            dp[i] += dp[i-2];
        }
    }
    System.out.println(dp[str.length()]);
}
}