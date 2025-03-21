/*Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. 
Therefore "eetr" is also a valid answer.*/
package ZohoQuestions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortCharacterByFreaquency {
	public static void main(String[] args) {
        String s = "tree";
        Map<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        Comparator<Object> c = new Comparator<Object>() {
            @Override
            public int compare(Object a , Object b){
                Character c1 = (Character)a;
                Character c2 = (Character)b;
                return -map.get(c1).compareTo(map.get(c2));
            }
        };

        PriorityQueue<Character> q = new PriorityQueue<>(c);
        for(Character ch : map.keySet()){
            q.offer(ch);
        }
       
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            char ch = q.poll();
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}