package Collection_Evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students implements Comparable{
	 int rollNo;
     String name;
     List<Integer> marks;

    public Students(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = new ArrayList<>(Arrays.asList(100,200,300,400,500));
    }

 @Override
    public int compareTo(Object obj){
        if (obj == null) {
            throw new NullPointerException();
        }
        Students name = (Students)obj;
        if(this.name.compareTo(name.name) > 0){
            return -1;
        }
        else if(this.name.compareTo(name.name) < 0){
            return 1;
        }
        else{
            return 0;
        }
    }

}
