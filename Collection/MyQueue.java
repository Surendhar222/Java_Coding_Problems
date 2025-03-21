package Collection;

import java.util.NoSuchElementException;

public class MyQueue<T> {
	private ListNode front;
    private ListNode rear;
    private int length;

    public MyQueue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }



    private class ListNode{
        private T data;
        private ListNode next;

        public ListNode(T data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return this.length;
    }

    public boolean isEmpty(){
        return this.length == 0;
    }

    public void enqueue(T data){
        ListNode node = new ListNode(data);
        if(front == null){
            front = node;
        }
        else{
            rear.next = node;
        }
        rear = node;
        length++;
    }

    public T dequeue(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    public T peek(){
        return front.data;
    }

    public T first(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.data;
    }

    public T last(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return rear.data;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        ListNode temp = front;
        while (temp != null) {
            sb.append(temp.data).append(", ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyQueue<String> q = new MyQueue<>();
        q.enqueue("Surendhar");
        q.enqueue("TK");
        q.enqueue("Vetrimaran");
        q.enqueue("Bala");
        q.enqueue("ManiRatnam");
        System.out.println(q);
      //  System.out.println(q.dequeue());
        System.out.println(q);
        System.out.println(q.first());
        System.out.println(q.last());
    }
}
