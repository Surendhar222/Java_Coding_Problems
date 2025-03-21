package CSV_File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeMap;

public class CSV_Reader {

    public static final String PATH = "file:///home/workspace/Test/src/CSV_File_Handling/Employee.csv";
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new FileReader(new File(PATH))
        );  

        TreeMap<Integer , String> map = new TreeMap<>(new MyComparator());
        
        String line;
        while ((line = reader.readLine()) != null) {
            String[] arr = line.split(",");
            map.put(Integer.parseInt(arr[2]), arr[2]);
        }
        System.out.println(map);
    }
}

class MyComparator implements Comparator{
    public int compare(Object a, Object b){
        Integer i1 = (Integer)a;
        Integer i2 = (Integer)b;
        int val = i1.compareTo(i2);
        if (val == 0) {
            return 1;
        }
        return val;
    }
}