package ZohoQuestions;

public class PrintSnakePattern {
	public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        boolean direction = true;
        for (int i = 0; i < arr.length; i++) {
            if (direction) {
                int col = 0;
                while(col < arr[0].length){
                    System.out.print(arr[i][col++]+" ");
                }
               // System.out.println();
            }
            if (!direction) {
                int col = arr[0].length-1;
                while (col >= 0) {
                    System.out.print(arr[i][col--]+" ");
                }
               // System.out.println();
            }
            direction = !direction;
        }
    }
}