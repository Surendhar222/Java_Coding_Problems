package ZohoQuestions;

import java.util.HashMap;

public class EncodeStringBasedOnCharacterFreaquency {
	public static void main(String[] args) {
        String s = "aaabbcdd";
        encodeAString(s);
    }

    private static void encodeAString(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);               
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character m : map.keySet()) {
            sb.append(map.get(m)).append(m);
        }
        System.out.println(sb);
    }
}