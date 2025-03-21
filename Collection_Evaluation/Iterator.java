package Collection_Evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        HashMap<Integer, HashMap<String, List<Integer>>> map = new HashMap<>();

        HashMap<String, List<Integer>> map1 = new HashMap<>();
        map1.put("Surendhar", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        map.put(101, map1);

        HashMap<String, List<Integer>> map2 = new HashMap<>();
        map2.put("sathish", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        map.put(102, map2);

        HashMap<String, List<Integer>> map3 = new HashMap<>();
        map3.put("guru", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        map.put(103, map3);

        HashMap<String, List<Integer>> map5 = new HashMap<>();
        map5.put("sakthi", new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        map.put(105, map5);

        for (Integer key : map.keySet()) {
            for (String innerKey : map.get(key).keySet()) {
                System.out.println(key + " " + innerKey + map.get(key).get(innerKey));
            }
        }
    }
}