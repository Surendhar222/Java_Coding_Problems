package L3Question;
import java.util.*;
public class Task {
	private static int id = 1;
    private String name;
    private int time;
    static Map<Integer , Queue<Task>> map = new TreeMap<>((a,b)-> Integer.compare(b, a));

    Task(String name , int time){
        this.id++;
        this.name = name;
        this.time = time;
    }
    public String toString(){
        return this.name +","+ this.time;
    }
}