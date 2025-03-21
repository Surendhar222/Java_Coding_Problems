/*Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.*/

package Array_Learning;

public class House_rob{
	public static void main(String[] args) {
        int even = 0 , odd = 0 ;
        int[] arr = {2,1};
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 != 0){
                odd += arr[i];
            }
            if (i == 0) {
                even += arr[i];
                continue;
            }
            if(i % 2 == 0){
                even += arr[i];
            }
        }
        System.out.println(Math.max(odd, even));
    }
}