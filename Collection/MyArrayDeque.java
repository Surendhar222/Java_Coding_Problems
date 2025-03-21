package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class MyArrayDeque<T> {
    private T[] array;
    private int defaultCapacity = 10;
    private int front; 
    private int rear;
    private int size;

	public MyArrayDeque(){
        this(10);
    }

    public MyArrayDeque(int initialCapacity){
        array = (T[]) new Object[initialCapacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public MyArrayDeque(Collection c){
        
    }

    private void grow(){
        T[] temp = (T[]) new Object[array.length*2];
        int i = 0;
        int j = front;
        do{
            temp[i++] = array[j];
            j = (j+1) % array.length;
        }while(j != front);
        array = temp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return (rear+1) % array.length == front;
    }
    public boolean add(T data){
        if (isFull()) {
            grow();
        }
        if (isEmpty()) {
            front++;
        }
        rear = ((rear+1) % array.length);
        array[rear] = data;
        size++;
        return true;
    }

    public T remove(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        else if(front == rear){
            front = -1;
            rear = -1;
        }
        T temp = array[front];
        front = ((front+1) % array.length);
        size--;
        return temp;
    }

    public T peek(){
        if(isEmpty())
            return null;
        return array[front];
    }

    public T peekFirst(){
        if(isEmpty())
            return null;
        return array[front];
    }

    public T peekLast(){
        if(isEmpty())
            return null;
        return array[rear];
    }

    public T getFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        return array[front];
    }

    public T getLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        return array[rear];
    }

    public void addFirst(T data){
        if (isFull()) {
            grow();
        }
        if (isEmpty()) {
            front++;
        }
        array[front] = data;
        //front = (front+1) % array.length;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        int i = 0;
        for (i = front; i <= rear ; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args) {
        MyArrayDeque<Integer> arr = new MyArrayDeque<Integer>();
        arr.add(10);
        arr.add(20);
        arr.addFirst(100);
        
        //System.out.println(arr.remove());
        System.out.println(arr);
    }
    
}