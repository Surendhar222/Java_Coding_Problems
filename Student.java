import java.util.ArrayList;

public class Student<T extends Number> {

    T data;

    public <U> Student(U data){
        this.data = (T) data;
        System.out.println(this.data);
    }

    public void m1(ArrayList l){
        l.add(10);
        l.add(20);
        l.add(30);
    }
    public static void main(String[] args) {
        Student<Integer> st = new Student("Helloooo");

        ArrayList<String> list = new ArrayList<>();
        list.add("100");
        list.add("Surendhar");
        list.add(null);
        st.m1(list);
    }
}