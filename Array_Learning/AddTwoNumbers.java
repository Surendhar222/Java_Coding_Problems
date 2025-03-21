package Array_Learning;

public class AddTwoNumbers {
	public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int k = 17;
        l1 : for (int i = 0; i < arr.length; i++) {
            int j = arr.length-1;
            while (0 <= j) {
                if(arr[i] + arr[j] == k){
                    System.out.println(true);
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                    break l1;
                }
                j--;
            }
        }
    }
}
