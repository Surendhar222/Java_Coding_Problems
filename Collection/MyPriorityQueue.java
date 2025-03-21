package Collection;

public class MyPriorityQueue {
	Integer[] heap;
    int n;

    public MyPriorityQueue(int capacity){
        heap = new Integer[capacity+1];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public void insert(int data){
        if (n == heap.length-1) {
            grow(2 * heap.length);
        }
        n++;
        heap[n] = data;
        swim(n);
    }

    private void swim(int n) {
        while(n > 1 && heap[n] > heap[n/2]){
            if(heap[n] > heap[n/2]){
                int temp = heap[n/2];
                heap[n/2] = heap[n];
                heap[n] = temp;
                n = n/2;
            }
        }
    }

    private void grow(int capacity){
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public int delete(){
        int max = heap[1];
        swap(1 , n);
        n--;
        balanceTree(1);
        heap[n+1] = null;
        if(n > 1 && n == (heap.length-1)/4){
            trimSize(heap.length/2);
        }
        return max;
    }

    private void swap(int a , int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void balanceTree(int k){
        while (2*k <= n) {
            int j = 2*k;
                if(j < n && heap[j] < heap[j+1]){
                j++;
                }
                if (heap[k] >= heap[j]) {
                    break;
                }
                else{
                    swap(k, j);
                }
                k = j;
        }
    }

    private void trimSize(int size){
         Integer[] temp = new Integer[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < heap.length; i++) {
            sb.append(heap[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyPriorityQueue pq = new MyPriorityQueue(9);
        pq.insert(9);
        pq.insert(10);
        pq.insert(2);
        pq.insert(4);
        pq.insert(1);
        pq.insert(5);
        pq.insert(7);

        System.out.println(pq);
        
        pq.delete();

        System.out.println(pq);
    }
}