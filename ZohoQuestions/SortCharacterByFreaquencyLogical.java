package ZohoQuestions;

import java.util.Arrays;

public class SortCharacterByFreaquencyLogical {
	public static void main(String[] args) {
        String s = "Tree";
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int idx = 0;
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int max = 0;
            int index = 0;
            for(int j = 0 ; j < 128 ; j++){
                if (max < freq[j]) {
                    max = freq[j];
                    index = j;
                }
            }
            while (freq[index] > 0) {
                ans[idx++] = (char)index;
                freq[index]--;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}