package Collection_Evaluation;

import java.nio.Buffer;
import java.util.Arrays;

public class MyHashMap<T , V> {
	
        HashNode[] bucket;
        int intialCapacity = 2;
        int size;

        public MyHashMap(){
            this.bucket = new HashNode[intialCapacity];
        }

        private class HashNode<T , V>{
            T key;
            V value;
            HashNode next;

            public HashNode(T key , V value){
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

        public int findIndex(T data){
            return Math.abs(data.hashCode() % bucket.length);
        }

        public void put(T key , V value){
            if (size == bucket.length) {
                grow(bucket.length*2);
            }

            int index = findIndex(key);
            HashNode temp = bucket[index];

            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                }
                temp = temp.next;
            }
            size++;
            HashNode node = new HashNode<T , V>(key , value);
            node.next = temp;
            bucket[index] = node;
        }

        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (int i = 0; i < bucket.length; i++) {
                HashNode temp = bucket[i];
                while (temp != null) {
                    sb.append(temp.key).append("=").append(temp.value).append(" ,");
                    temp = temp.next;
                }
            }
            sb.append("}");
            return sb.toString();
        }

        private void grow(int capacity){
            HashNode<T,V>[] temp = new HashNode[capacity];

            for (int i = 0; i < bucket.length; i++) {
                HashNode head = bucket[i];

                while (head != null) {
                    int newIndex = Math.abs(head.key.hashCode() % capacity);

                    HashNode<T,V> node = new HashNode(head.key, head.value);
                    node.next = temp[newIndex];
                    temp[newIndex] = node;

                    head = head.next;
                }
            }
            bucket = temp;
        }


        public static void main(String[] args) {
            MyHashMap<Integer , String> map = new MyHashMap<>();
            map.put(10, "Surendhar");
            map.put(11, "sathish");
            map.put(12, "guru");
            map.put(13, "raj");
            map.put(14, "sakthi");
            map.put(10, "zoho");
            System.out.println(map);

        }
}