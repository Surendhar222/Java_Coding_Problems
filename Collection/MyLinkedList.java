package Collection;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
	Node head;

    public MyLinkedList(){
        head = null;
    }
    class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }   
    }

    public void insertAtBegining(T data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPos(int pos , T data){
        if(pos == 0){
            insertAtBegining(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1 ; i < pos ; i++) {
            temp = temp.next;
                if(temp == null){
                    throw new IllegalArgumentException("Invalid Position");
                }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteAtPos(int pos){
        if(pos == 0){
            deleteAtBeginig();
            return;
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("List is Empty");
        }
        Node prev = null;
        Node temp = head;
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void deleteAtBeginig(){
        if (head == null) {
            throw new IndexOutOfBoundsException("List is Empty");
        }
        head = head.next;
    }

    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = current.next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
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
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.insertAtBegining(10);
        ll.insertAtBegining(20);
        ll.insertAtPos(1 , 100);
        ll.insertAtBegining(10000);
        ll.insertAtBegining(5000);
        ll.display();
        //ll.deleteAtPos(0);
        //ll.deleteAtBeginig();
        ll.reverse();
        ll.display();

       Iterator<Integer> itr= ll.iterator();
       while (itr.hasNext()) {
        System.out.println(itr.next());
       }
    }
}