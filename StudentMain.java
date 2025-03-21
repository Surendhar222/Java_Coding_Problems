import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Student {
	String name;
    int age;
    static int var = 1;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        Student st  = (Student)obj;
        if(this.age != st.age){
            for (int i = 0; i < this.name.length(); i++) {
                if(this.name.charAt(i) != st.name.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode(){
        return ++var;
    }

    public String toString(){
        return name + " " + age;
    }
}

public class StudentMain{
    public static void main(String[] args){
        Student st1 = new Student("Surendhar" , 23);
        Student st2 = new Student("raj" , 30);
        Student st3 = new Student("Sakthi" , 65);
        Student st4 = new Student("Surendhar" , 23);
        //System.out.println(st);
        HashSet<Student> set= new HashSet<>();
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        System.out.println(set);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        List<Integer> containsList = new ArrayList<>();
        containsList.add(10);
        containsList.add(30);
        System.out.println(list.containsAll(containsList));
        System.out.println(list.removeAll(containsList));
        Integer[] obj = list.toArray(new Integer[1]);
        System.out.println(Arrays.toString(obj));
    }
}