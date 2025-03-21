package Collection;

import java.util.Collection;

public class MyHashSet<T> {
    private int defautCapacity;
    private float loadFactor;
    private final static Object present = new Object();
    private MyHashTable map;

	public MyHashSet(){
        map = new MyHashTable();
        this.loadFactor = 0.75f;
    }

    public MyHashSet(int initialCapacity){
        this.defautCapacity = initialCapacity;
        this.loadFactor = 0.75f;
    }

    public MyHashSet(int initialCapacity , float loadFactor){
        this.defautCapacity = initialCapacity;
        this.loadFactor = loadFactor;
    }

    public MyHashSet(Collection c){
        
    }

    public boolean add(T element){
        return map.put(element, present) == null;
    }
    public boolean remove(Object obj){
        return map.remove(obj) == present;
    }

    public int size(){
        return map.size();
    }

    public boolean isEmpty(){
        return map.isEmpty();
    }

    public void clear(){
        map.clear();
    }

    public boolean contains(Object obj){
        return map.get(obj) !=  null;
    }

    public String toString(){
        String s =  map.toString();
        StringBuffer sb = new StringBuffer(s);
        int equal = 0 , i = 0;
        for (i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '=') {
                equal = i; 
                sb.delete(equal, equal+26);
            }
            if (sb.charAt(i) == '}') {
                sb.delete(i-2, i);
            }
        }
        return sb.toString();
        //return map.toString();
    }

    public static void main(String[] args) {
        MyHashSet<String> set = new MyHashSet<String>();
       System.out.println( set.add("hi"));
        set.add("hi");
        set.add("hellooo");
        set.add("element");
        System.out.println( set.add("hi"));
        //set.remove("hellooo");
        //System.out.println(set.contains("hellooo"));
        System.out.println(set);
    }
    


}