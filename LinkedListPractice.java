import java.util.NoSuchElementException;

public class LinkedListPractice<T> {
	
    Node<T> head;
    Node<T> tail;
    private int size;

    public LinkedListPractice(){
        head = null;
        tail = null;
    }


    private class Node<T>{
        T value;
        Node previous;
        Node next;

        public Node(T data){
            this.value = data;
            this.previous = null;
            this.next = null;
        }
    }

    public boolean addFirst(T data){
       Node newNode = new Node<T>(data);
       if (head == null) {
            head = newNode;
            tail = newNode;
       }
       else{
        newNode.next = head;
        head.previous = newNode;
        newNode.previous = null;
        head = newNode;
       }
       return true;
    }

    public T removeFirst(){
        if (head == null) {
            throw new NoSuchElementException();
        }
        head = head.next;
        T val = head.value;
        if (head == null) {
            head = null;
            tail = null;
        }
        else{
            head.previous = null;
        }
        return val;
    }

    public boolean addLast(T data){
        Node newNode = new Node<T>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        return true;
    }

    public void add(T data){
        Node newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        addLast(data);
    }

    public void add(int pos , T data){
        if (pos == 0) {
            addFirst(data);
        }
        Node newNode = new Node<T>(data);
        Node temp = head;
        for (int i = 1; i < pos ; i++) {
            temp = temp.next;
            if (temp == null) {
                throw new NoSuchElementException();
            }
        }
        newNode.next = temp.next;
        newNode.previous = temp;
        if (temp == tail) {
            tail= newNode;
        }
        else{
            tail.next.previous = newNode;
        }
        temp.next = newNode;
    }

    public void removeLast(T value){
        if (head == null) {
            throw new NoSuchElementException();
        }
        tail = tail.previous;
        if (tail == null) {
            head = null;
        }
        else{
            tail.next = null;
        }
    }

    public void removeAtPos(int pos , T data){
        Node temp = head;
        Node previous = null;
       for (int i = 1; i <= pos; i++) {
            previous = temp;
            temp = temp.next;
       }
       previous.next = temp.next;
       if (temp.next == null) {
            tail = previous;
       }
       else
            temp.next.previous = previous;
    }
}