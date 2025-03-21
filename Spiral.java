public class Spiral{
public static void main(String[] args){
	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
	System.out.println(findK(matrix,3,3,9));
}
static int findK(int matrix[][], int n, int m, int s)
    {
        int[] temp = new int[m*n];
        int count = 0;
        int k = 0 , l = 0;
        while(k < m && l < n){
            for(int i = l ; i < n ; i++){
                temp[count++] = matrix[k][i];
            }
            k++;

            for(int i = k ; i < m ; i++){
                temp[count++] = matrix[i][n-1];
            }
            n--;

            if(k < m){
                for(int i = n-1 ; i >= l ; i--){
                temp[count++] = matrix[m-1][i];
                }
                m--;
            }

            if(l < n){
                for(int i = m-1 ; i >= k ; i--){
                    temp[count++] = matrix[i][l];
                }
                l++;
            }
        }
        System.out.println(s);
        for(int i = 0 ; i < temp.length ; i++){
            if(temp[i] == s){
            	return i+1;
            }
        }
        return -1;
    }
}