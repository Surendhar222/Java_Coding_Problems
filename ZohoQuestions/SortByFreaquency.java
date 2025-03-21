/*Input: arr[] = [5, 5, 4, 6, 4]
Output: [4, 4, 5, 5, 6]
Explanation: The highest frequency here is 2. 
Both 5 and 4 have that frequency. 
Now since the frequencies are the same the smaller element comes first. 
So 4 4 comes first then comes 5 5. 
Finally comes 6. 
The output is 4 4 5 5 6.*/

package ZohoQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortByFreaquency {
	public static void main(String[] args) {
        int[] arr = {5, 5, 4, 6, 4};
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Object>() {
                public int compare(Object a , Object b) {
                    Integer i = (Integer)a;
                    Integer ii = (Integer)b;
                int val = map.get(ii).compareTo(map.get(i));
                if(val == 0){
                    return i.compareTo(ii);
                }
                return val;
            }
        });
        for (Integer a : map.keySet()) {
            q.offer(a);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            Integer a = q.poll();
            for (int i = 0; i < map.get(a); i++) {
                ans.add(a);
            }
        }
        System.out.println(ans);
    }
}