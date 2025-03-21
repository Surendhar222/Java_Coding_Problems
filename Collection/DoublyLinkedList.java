package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements Iterable {
    private Node head;
    private Node tail;
	private int size;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public DoublyLinkedList(Collection c){

    }


    private class Node{
        Node previous;
        Node next;
        T data;

        public Node(T data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    public void addFirst(T data){
        Node newNode = new Node(data);
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
    }

    public void addLast(T data){
        Node newNode = new Node(data);
        if(tail != null){
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }

    public void display(){
        System.out.println();
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
    }

    public void displayReverse(){
        System.out.println();
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.previous;
        }
    }

    public boolean add(T data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            addLast(data);
        }
        
        return true;
    }

    public void add(int pos , T data){
        if (pos == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if(temp == null){
                throw new NoSuchElementException();
            }
        }
        newNode.next = temp.next;
        newNode.previous = temp;
        if(temp == tail){
            tail = newNode; 
        }
        else{
            temp.next.previous = newNode;
        }
        temp.next = newNode;
    }

    public T removeFirst(){
        if(head == null){
            throw new NoSuchElementException();
        }
        T element = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        else
            head.previous = null;
        return element;
    }

    public T removeLast(){
        if (head == null) {
            throw new NoSuchElementException();
        }
        T elemet = tail.data;
        tail = tail.previous;
        if(tail == null){
            head = null;
        }
        else{
            tail.next = null;
        }
        return elemet;
    }

    public T remove(){
        if (head == null) {
            throw new NoSuchElementException();
        }
        T element = head.data;
        removeFirst();
        return element;
    }

    public void remove(int pos){
        if(head == null){
           throw new NoSuchElementException();
        }
        Node temp = head;
        Node previous = null;
        for (int i = 1; i <= pos ; i++) {
            previous = temp;
            temp = temp.next;
            if(temp == null){
                throw new NoSuchElementException();
            }
        }
        previous.next = temp.next;
        if(temp.next == null){
            tail = previous;
        }
        else
            temp.next.previous = previous;
    }

    public boolean remove(Object obj){
        if(head == null){
           throw new NoSuchElementException();
        }
        Node temp = head;
        Node previous = null;
        while (temp != null) {
            if (temp.data.equals(obj)) {
                previous.next = temp.next;
                temp.next.previous = previous;
                return true;
            }
            previous = temp;
            temp = temp.next;
        }
        return false;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>(){
            Node temp = head;
            public boolean hasNext(){
                return temp != null;
            }
            public T next(){
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        // list.removeLast();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.display();
        list.addLast(60);
        list.add(10000);
        list.remove();
        //list.remove(10);
       // list.removeLast();
        list.display();
       // System.out.println(list);
    }
}