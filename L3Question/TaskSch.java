package L3Question;

import java.util.*;

public class TaskSch {
	static Scanner scan = new Scanner(System.in);
    public static void addTask(){
		System.out.println("Enter name");
		String name = scan.next();
		System.out.println("Enter Time");
		int time = scan.nextInt();
		if(!Task.map.containsKey(time)){
			Task.map.put(time , new LinkedList<>());
		}
		Task.map.get(time).offer(new Task(name , time));
		//System.out.println(Task.map);
	}
	//Map<Integer , Queue<Task>> map = new TreeMap<>((a,b)-> Integer.compare(b, a));

	public static void print(){
		for(Integer i : Task.map.keySet()){
			for(Task t : Task.map.get(i)){
				System.out.println(t);
			}
		}
	}
}