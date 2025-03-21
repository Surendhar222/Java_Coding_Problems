package DataStructuresAndAlgorithm;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	public static void main(String[] args) {
        Hashtable<Integer , String> ht = new Hashtable<>();
        ht.put(1, "Surendhar");
        ht.put(2, "TK");
        ht.put(3 , "Bala");

        Enumeration<String> e = ht.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        for(Map.Entry<Integer , String> m : ht.entrySet()){
            System.out.println(m.getKey() +"......."+m.getValue());
        }
    }
}