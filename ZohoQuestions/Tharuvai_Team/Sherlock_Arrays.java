package ZohoQuestions.Tharuvai_Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sherlock_Arrays {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Arrays");
        int n = scan.nextInt();
        scan.nextLine();
        int varNum = 1;
        List<List<Integer>> outterList = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            System.out.println("Enter the" + " " + (varNum++) + "st" + " "+ " array Elements");
            String[] num = scan.nextLine().split(" ");
            List<Integer> innerList = new ArrayList<>();
            for (String nums : num) {
                innerList.add(Integer.parseInt(nums));
            }
            outterList.add(innerList);
        }
        sherLock(outterList);
        System.out.println(outterList);
    }

    private static void sherLock(List<List<Integer>> outterList){
        for (List<Integer> list : outterList) {
            int sum = 0;
            for (int nums : list) {
                sum += nums;
            }

            int left = 0;
            for (int number : list) {
                int right = sum - left - number;
                if(right == left){
                    System.out.println("YES");
                }
                left  = left + number;
            }
        }
        System.out.println("NO");  //work correctly for return statement
    }
}