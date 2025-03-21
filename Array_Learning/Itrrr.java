package Array_Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.TreeSet;
import java.util.WeakHashMap;

public class Itrrr{
	public int m1(){
        System.out.println("M1 method");
        return 10;
    }
    public int m2(){
        System.out.println("M2 method");
        return 20;
    }
    public int m3(){
        System.out.println("M3 method");
        return 30;
    }
    public static void main(String[] args) {
        Double i1 = new Double(1000.25);
        Double i2 = new Double(1000.25);
        // System.out.println(i1 == i2);
        // System.out.println(i1.equals(i2));
        Character c1 = new Character('a');
        Character c2 = new Character('a');
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        HashMap<Integer , String> map = new HashMap<>();
        Integer i = new Integer(10);
        map.put(i, "Surendhar");
        i = null;
        System.gc();
        System.out.println(map);
        
    }
}