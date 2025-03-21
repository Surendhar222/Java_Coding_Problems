package Collection;

import java.util.EmptyStackException;

public class MyStack<T> {
	private ListNode top;
    private int length;

    public MyStack(){
        top = null;
        length = 0;
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
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(T data){
        ListNode node = new ListNode(data);
        node.next = top;
        top = node;
        length++;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public T peek(){
        return top.data;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        ListNode temp = top;
        while (temp != null) {
            sb.append(temp.data).append(", ");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyStack<String> stk = new MyStack<>();
        stk.push("Surendhar");
        stk.push("ManiMozhi");
        stk.push("Alaska");
        stk.push("IAS");
        stk.push("Director");
        System.out.println(stk);
        System.out.println(stk.pop());;
        System.out.println(stk);
        System.out.println(stk.peek());
    }
}