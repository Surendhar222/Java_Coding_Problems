package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList<T>implements Iterable{
    private int initial_Capacity;
    private int size;
   // private static final Object[] array = {};
    private static Object[] arr;
	public MyArrayList(){
        initial_Capacity = 10;
        this.arr = new Object[initial_Capacity];
    }

    public MyArrayList(Collection obj){
        addAll(obj);
    }

    public MyArrayList(int inialCapacity){
        if (inialCapacity > 0) {
            this.arr = new Object[initial_Capacity];
        }
        else{
            throw new IllegalArgumentException("Invalid Capacity");
        }
    }

    public String toString(){
         StringBuffer sb = new StringBuffer();
         sb.append("[");
         for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                sb.append(arr[i]);
                if(i != size-1)
                    sb.append(", ");
            }
         }
         sb.append("]");
         return sb.toString();
    }

    private void grow(){
        Object[] temp = new Object[(arr.length*3/2)+1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public boolean add(T a){
        if(size == arr.length){
            grow();
        }
        arr[size] = a;
        size++;
        return true;
    }

    public void add(int idx , T a){
        if(idx > size || idx < 0){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
        if(size == arr.length){
            grow();
        }
        for (int i = size ; i >= 0 ; i--) {
            if(i != idx){
                arr[i] = arr[i-1];
            }
            else{
                arr[i] = a;
                size++;
                return;
            }
        }
    }

    public boolean addAll(Collection<? extends T> c){
        if(size == arr.length){
           grow();
        }
        Object[] obj = c.toArray();
        for (int i = 0; i < obj.length ; i++) {
            arr[size++] = obj[i];
        }
        return true;
    }

    public boolean addAll(int idx , Collection<? extends T> c){
        if(idx > size || idx < 0){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
        if(size == arr.length){
           grow();
        }
        Object[] obj = c.toArray();
        int n = obj.length , index = 0 ;
        boolean flag = true;
        for (int i = size+n ; i >= 0 ; i--) {
            if(i != idx && flag){
                arr[i] = arr[i-1+n];
            }
            else{
                arr[i] = obj[index++];
                size++;
                flag = false;
                if(index == obj.length)
                    return true;
            }
        }
        return true;
    }

    public void clear(){
        Object[] temp = new Object[arr.length];
        arr = temp;
        size = 0;
    }

    public T set(int index , T data){
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T temp = (T)arr[index];
        arr[index] = data;
        return temp;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public boolean contains(Object obj){
       // MyArrayList<T> element = (MyArrayList<T>)obj;
        for (int i = 0; i < arr.length; i++) {
            if(obj == arr[i]){
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int minCapacity){
        if (minCapacity < 0) {
            throw new NegativeArraySizeException("Negative Size");
        }
        Object[] temp = new Object[arr.length + minCapacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        if(index > size || index < 0){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
        return (T)(arr[index]);
    }

    public int indexOf(Object obj){
        for (int i = 0; i < arr.length; i++) {
            if(obj == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if(size != 0){
            return false;
        }
        return true;
    }

     public int lastIndexOf(Object obj){
        for (int i = arr.length-1 ; i >= 0 ; i--) {
            if(obj == arr[i]){
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public T remove(int idx){
        if(idx > size || idx < 0){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }
        T element = (T)arr[idx];
        for (int i = idx; i < arr.length-1; i++) {
           arr[idx] = arr[idx+1];
        }
        size--;
        return element;
    }

    public boolean remove(Object obj){
        boolean changed = false;
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i] == obj){
            changed = true;
           }
           if (changed) {
            arr[i] = arr[i+1];
           }
        }
        size--;
        return changed;
    }

    public boolean removeAll(Collection<?> c){
        Object[] obj = c.toArray();
        boolean flag = false;
        for (int i = 0; i < obj.length; i++) {
            Object ele = obj[i];
            boolean changed = false;
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] == obj[i]) {
                        changed = true;
                        flag = true;
                    }
                    if (changed) {
                        arr[j] = arr[j+1];
                    }
                }
                 size--;
        }
        return flag;
    }

    public boolean retainAll(Collection<?> c){
        Object[] obj = c.toArray();
        arr = obj;
        size = arr.length;
        return true;
    }

    public int size(){
        return size;
    }

    public Object[] toArray(){
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public Object[] subList(int fromIdx , int toIdx){
        int size = toIdx - fromIdx;
        Object[] temp = new Object[size];
        for (int i = fromIdx; i < toIdx ; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public void trimToSize(){
        Object[] temp = new Object[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>(){
            int idx = 0;
            public boolean hasNext(){
                return arr[idx++] != null;
            }
            public T next(){
               return (T)arr[idx++];
            }
        };
    }

    public void sort(Comparator<T> obj){
        
    }
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("Hello");
        list.add("Vanakam");
        list.add("hiii");
        list.add("Zoho");
        list.add("TCS");
        list.add("Infosys");
        System.out.println(list);
        System.out.println(list.size());
        Object[] array = list.toArray();
    System.out.println(Arrays.toString(array));
        ArrayList<String> ll = new ArrayList<>();
        ll.add("TCS");
        ll.add("hiii");
        ll.add("Hello");
    //     System.out.println(ll);
         list.retainAll(ll);
         System.out.println(list);
         System.out.println(list.size());
    //     System.out.println(list);
    //     //System.out.println(list.remove("hiii"));
    //     System.out.println(list);
    //    // System.out.println(Arrays.toString(arr));
    }
}