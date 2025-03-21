import java.util.HashMap;
import java.util.Map;

public class SudokuSolver {
	public static void main(String[] args){
        String[][] arr = {{"5","3",".",".","7",".",".",".","."}
,{"6",".",".","1","9","5",".",".","."}
,{".","9","8",".",".",".",".","6","."}
,{"8",".",".",".","6",".",".",".","3"}
,{"4",".",".","8",".","3",".",".","1"}
,{"7",".",".",".","2",".",".",".","6"}
,{".","6",".",".",".",".","2","8","."}
,{".",".",".","4","1","9",".","2","5"}
,{".",".",".",".","8",".",".","7","9"}} ;

// search in rows
    rowCheck(arr);
    // Search in cols
    colCheck(arr);
// search in subBoxes
int i = 0;
    while(i < arr.length){
        int j = 0;
        while (j < arr[0].length) {
            subBox(arr , i , j);
            j+=3;
        }
        i+=3;
    }    
    }
    public static boolean rowCheck(String[][] arr){
        int col = 0;
        while(col < arr[0].length){
        for (int i = 0; i < arr.length; i++) {
            Map<Integer,String> map = new HashMap<>();
            if(arr[i][col] != ","){
                if(!map.containsValue(arr[i][col])){
                    map.put(i, arr[i][col]);
                }
                else{
                    return false;
                }
            }
        }
        col++;
        }
        return true;
    }

    public static boolean colCheck(String[][] arr){
        int row = 0;
        while(row < arr.length){
        for (int i = 0; i < arr.length; i++) {
            Map<Integer,String> map = new HashMap<>();
            if(arr[row][i] != ","){
                if(!map.containsValue(arr[row][i])){
                    map.put(i, arr[row][i]);
                }
                else{
                    return false;
                }
            }
        }
        row++;
        }
        return true;
    }

    public static boolean subBox(String[][] arr , int row , int col){
         Map<Integer,String> map = new HashMap<>();
        for(int i = row ; i < row+3 ; i++){
            for(int j = col ; j < col+3 ; j++){
               if(!map.containsValue(arr[i][j])){
                map.put(i, arr[i][j]);
               }
               else{
                return false;
               }
            }
        }
        return true;
    }
}