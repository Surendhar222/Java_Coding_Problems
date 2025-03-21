package Collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
        Employee e = new Employee(1, "BMW");
        Employee e1 = new Employee(2, "Audi");
        Employee e2 = new Employee(3, "Hello");
        // Employee e3 = new Employee(4, "Hii");
        // Employee e4 = new Employee(5, "Zoho");
        // Doctor d = new Doctor(2, "Audi");
        // TreeSet set = new TreeSet<>((a , b) -> b.toString().compareTo(b.toString()));
       
        // set.add(d);
        HashSet hash = new HashSet<>();
        hash.add(e);
        hash.add(e1);
        hash.add(e2);
        // hash.add(e3);
        // hash.add(e4);
        System.out.print(hash);
        
    }
   
}

// class myComparator implements Comparator<CustomSorting>{
//         public int compare(CustomSorting obj1 , CustomSorting obj2){
//             return obj2.getId() - obj1.getId();
//         }
//     }