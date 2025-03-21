package Collection_Evaluation;

import java.util.Scanner;
import java.util.TreeSet;

public class Sorting {
    public static void main(String[] args) {
        Students student1 = new Students(101, "surendhar", 100);
        Students student2 = new Students(101, "sathish", 100);
        Students student3 = new Students(101, "guru", 100);
        Students student4 = new Students(101, "sakthi", 100);
        Students student5 = new Students(101, "raj", 100);
        Students student6 = new Students(101, "aravind", 100);
        Students student7 = new Students(101, "akash", 100);

        TreeSet<String> set = new TreeSet<>();
        set.add(student1.name);
        set.add(student2.name);
        set.add(student3.name);
        set.add(student4.name);
        set.add(student5.name);
        set.add(student6.name);
        set.add(student7.name);
        System.out.println(set);
    }
}