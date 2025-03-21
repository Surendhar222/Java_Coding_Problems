package Collection;

import java.time.chrono.ThaiBuddhistEra;

public class MyHashTable<T , V> {
    HashNode[] buckets;
    int numOfBuckets;
    int size;

    public MyHashTable(){
        this(10);
    }
    public MyHashTable(int capacity){
        buckets = new HashNode[capacity];
        numOfBuckets = capacity;
        size = 0;
    }

    private class HashNode<K , V>{
        K key;
        V value;
        HashNode<K , V> next;

        public HashNode(K key , V value){
            this.key = key;
            this.value = value;
        }
    }

    public int getBucketIndex(T key){
        return Math.abs(key.hashCode() % numOfBuckets);
        //return 1;
    }

    public V put(T key , V value){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                V val = (V)head.value;
                head.value = value;
                return (V)val;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
        return null;
    }

    public V get(T key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                return (V)head.value;
            }
            head = head.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        if (size > 0) {
            size = 0;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = null;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public V remove(T key){
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            previous = head;
            head = head.next;        
        }
        if(head == null){
            return null;
        }
        size--;
        if (previous != null) {
            previous.next = head.next;
        }
        else{
            buckets[bucketIndex] = head.next;
        }
        return (V)head.value;
    }
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        for (int i = 0; i < numOfBuckets; i++) {
            HashNode head = buckets[i];
            while (head != null) {
                sb.append(head.key).append("=").append(head.value).append(", ");
                head = head.next;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    void change(){
         buckets[1] = null;
    }

    public static void main(String[] args) {
        MyHashTable<Integer , String> table = new MyHashTable<>();
        System.out.println(table.put(11, "value"));
        table.put(2 , "hello");
        table.put(3 , "hiiiiiiii");
        table.put(121, "surendhar");
        System.out.println(table.put(11, "sura"));
        // System.out.println(table.get(2));
        // System.out.println(table.remove(2));
        System.out.println(table);
        // table.change();
        // System.out.println(table);
        System.out.println();
    }
}