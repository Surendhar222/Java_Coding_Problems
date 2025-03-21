package Gold_Gobble_Game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Game_Board {

    static String[][] board;
    Map<String , PriorityQueue<String>> map = new HashMap<>();
    

	public void initializeBoard(){

        int n = 1;
        n += new Gold_Gobble().boardSize();
        
        board = new String[n][n];
        for(String[] ar: board){
            Arrays.fill(ar,"  ");
        }
        int alphabets = 65;
        int leftNumbers = 1;
        for (int i = 1; i < board.length; i++) {
            board[0][i] = "  "+(char)(alphabets++);
            board[i][0] = "  "+leftNumbers++;
        }
        printBoard();
        System.out.println("Board Initialized Successfully.........");
    }

    private void printBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
            System.out.println();
        }
    }
    //PriorityQueue maxHeap;
    @SuppressWarnings("unchecked")
    public void move(int row , int col , String coin){
        //Orangegobbles.add(coin);
        String keyFounded = "";
        boolean found = false;
        // Checks Currosponding coin already Availabale
        for (String k : map.keySet()) {
            found = map.get(k).contains(coin);
            if(found){
                keyFounded = k;
                break;
            }
        }
        char ch = (char) (64 + col);
        String key = ""+ch+row;

        if (found && !map.get(keyFounded).peek().equals(coin)) {
                System.out.println("Can't move");
        }
        else if (found) {
            String alreadyLyingCoin = map.get(keyFounded).poll();
            try {
                board[row][col] = alreadyLyingCoin;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Invalid Position");
            }
            //Decode
            row = keyFounded.charAt(0)-64;
            col = keyFounded.charAt(1)-48;
            try {
                board[row][col] = map.get(keyFounded).peek();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Invalid Position");
            }
            printBoard();
        }
        // if not Available the check this key already contains any value if contains add into queue
        else if (map.containsKey(key)) {
            
                if (!found && ((coin.charAt(1)-48) > (map.get(key).peek().charAt(1)-48))) {
                    map.get(key).offer(coin);
                }
                else
                    System.out.println("Already Exists Please try another coin");
           
        }
        // if key not available then create new key and queue
        else{
            map.put(key, new PriorityQueue<String>((a,b) -> b.compareTo(a)));
            if (!found) {
                map.get(key).offer(coin);
            }
            else
                System.out.println("Already Exists Please try another coin");
        }
        if (!found) {
            try {
                board[row][col] = map.get(key).peek();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Invalid Position");
            }
            System.out.println();
            printBoard();
        }
    }

    public boolean checkWon(Player p){
        return rowCheck(p) || colCheck(p) || leftDiagonalCheck(p) || rightDiagonalCheck(p);
    }

    public boolean rowCheck(Player p){
        for (int row = 1; row < board.length; row++) {
            int count = 1;
            char ch = p.coinClr;
            for (int col = 1; col < board.length; col++) {
                if (ch == board[row][col].charAt(0)) {
                    count++;
                }
                if (count == board.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean colCheck(Player p){
        for (int col = 1; col < board.length; col++) {
            int count = 1;
            char ch = p.coinClr;
            for (int row = 1; row < board.length; row++) {
                if (ch == board[row][col].charAt(0)) {
                    count++;
                }
                if (count == board.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean leftDiagonalCheck(Player p){
        int count = 1;
        for (int row = 1; row < board.length; row++) {
            char ch = p.coinClr;
            if (board[row][row].charAt(0) == ch) {
                count++;
            }
            if (count == board.length) {
                return true;
            }
        }
        
        return false;
    }

    public boolean rightDiagonalCheck(Player p){
        int col = board.length-1 , count = 1;
        char ch = p.coinClr;
        for (int row = 1; row < board.length; row++) {
           if (ch == board[row][col--].charAt(0)) {
                count++;
           }
           if (count == board.length) {
                return true;
           }
        }
        return false;
    }
}