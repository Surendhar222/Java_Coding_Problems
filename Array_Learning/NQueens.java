package Array_Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
	public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        int n = 4;
        char[][] board = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }

        solve(0 , board , list , n);
         for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static List<String> list(char[][] board){
        List<String> ll = new ArrayList<>();
        for (int row = 0; row < board.length; row++) {
            String s = new String(board[row]);
            ll.add(s);
        }
        return ll;
    }

    private static void solve(int col , char[][] board , List<List<String>> list , int n){
        if(col == n){
            list.add(list(board));
            return;
        }

        for (int row = 0; row < n ; row++) {
            if(isSafe(row , col , board , n)){
                board[row][col] = 'Q';
                solve(col+1, board, list, n);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(int row , int col , char[][] board , int n){
        int duplicateRow = row;
        int duplicateCol = col;
        while (row >= 0 && col >= 0) {
            if(board[row][col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }

        row = duplicateRow;
        col = duplicateCol;

        while (col >= 0) {
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }

        row = duplicateRow;
        col = duplicateCol;

        while (row < n && col >= 0) {
            if(board[row][col] == 'Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
}