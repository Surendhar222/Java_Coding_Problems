import java.util.HashMap;
import java.util.Map;

public class SudokuGame {
	public static void main(String[] args) {
        String[][] arr = {{"5","3",".",".","7",".",".",".","."}
,{"6",".",".","1","9","5",".",".","."}
,{".","9","8",".",".",".",".","6","."}
,{"8",".",".",".","6",".",".",".","3"}
,{"4",".",".","8",".","3",".",".","1"}
,{"7",".",".",".","2",".",".",".","6"}
,{".","6",".",".",".",".","2","8","."}
,{".",".",".","4","1","9",".","2","5"}
,{".",".",".",".","8",".",".","7","9"}} ;

Map<Integer,String> map = new HashMap<>();
int row = 0 , col= 0;
while (col < arr[0].length) {
    for(int i = 0 ; i < arr.length ; i++){
        if(arr[i][col] != "."){
        if(!map.containsValue(arr[i][col]) && arr[i][col] != "."){
            map.put(i, arr[i][col]);
        }
        else{
            System.out.println("False");
            System.out.println(arr[i][col]);
            return;
        }
        }
    }
    //System.out.println(map);
    map.clear();
    col++;
}
while (row < arr.length) {
    for(int i = 0 ; i < arr[0].length ; i++){
        if(arr[row][i] != "."){
        if(!map.containsValue(arr[row][i]) && arr[row][i] != "."){
            map.put(i, arr[row][i]);
        }
        else{
            System.out.println("False");
            System.out.println(arr[row][i]);
            return;
        }
        }
    }
    map.clear();
    row++;
}
int n = 3 , index = 0;
col = 0;
for(int i = 0 ; i < 3 ; i/3){
    for(int j = 0 ; j < 9 ; j/3){}
        if(arr[i][j] != "."){
            if(!map.containsValue(arr[i][col])){
                map.put(i, arr[i][j]);
            }
            else{
                System.out.println("False");
                return;
            }
        }
        j++;
    }
    i++;
}
System.out.println("Still All true");
    }
}