package String_Practice;

public class DecodeWaysHard {
    public static void main(String[] args) {
        String str = "1*";
        int[] dp = new int[str.length()+1];
          dp[0] = 1;
        // dp[1] = str.charAt(0) == '0' ? 0 : 1;
         if(str.charAt(0) == '*'){
             dp[0] = 1;
         }
        int oneDigit = 0 , twoDigit = 0;
        for (int i = 1; i <= str.length(); i++) {
            if(str.charAt(i) == '*'){
                oneDigit = 1;
                twoDigit = Integer.parseInt(""+str.charAt(i-1)+1);
            }
            if(oneDigit >= 1 && dp[i] != '*'){
                dp[i] += dp[i-1];
            }
            else
                dp[i] += oneDigit;
            if(twoDigit >= 1 && dp[i] != '*'){
                dp[i] += dp[i-2];
            }
            else
                dp[i] += twoDigit;
        }
        System.out.println(dp[str.length()]);
    }
}