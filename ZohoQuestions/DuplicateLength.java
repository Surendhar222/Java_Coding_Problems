/*Input: arr = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e.
 [2] so modified array will contains 2 at first position and you should return 1 after 
 modifying the array, the driver code will print the modified array elements.*/

package ZohoQuestions;

import java.util.Arrays;

public class DuplicateLength {
	public static void main(String[] args) {
        // if (arr.length < 1) {
        //     return 0;
        // }
        int[] arr = {1 , 2 , 3 , 3 , 4  , 4 , 5 , 5};
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[i-1]){
                    arr[index++] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}