public class MaxArray{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,12};
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}