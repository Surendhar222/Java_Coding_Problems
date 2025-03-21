package Gold_Gobble_Game;

import java.util.Scanner;

public class Gold_Gobble {

    Player p1 , p2;
    Scanner scan = new Scanner(System.in);
    Game_Board gb = new Game_Board();

    public void start(){
        int modCount = 0;
        if (modCount == 0) {
            System.out.println("Enter Your Name");
            String name = scan.next();
            System.out.println("Enter your Coin Color");
            char coin = scan.next().charAt(0);
            p1 = new Player(name, coin);
            modCount++;
        }
        if (modCount == 1) {
            System.out.println("Enter Your Name");
            String name = scan.next();
            System.out.println("Enter your Coin Color");
            char coin = scan.next().charAt(0);
            p2 = new Player(name, coin);
            modCount++;
        }
        if(modCount > 1){
            while (true) {
                System.out.println("Enter the Position for :" + p1.playerName);
                String pos = scan.next();
                System.out.println("Enter the coin");
                String coin = scan.next();
                if (coin.charAt(0) == p1.coinClr) {
                    gb.move((int)(pos.charAt(1)-48) , (int)(pos.charAt(0)-64) , coin);
                }
                else{
                    try{
                        throw new IllegalArgumentException("Invalid coin");
                    }catch(Exception e){
                        e.getMessage();
                        continue;
                    }
                }
                if (gb.checkWon(p1)) {
                    System.out.println(p1.playerName +"   " + "Won!!!");
                    System.exit(0);
                }
                else{
                    System.out.println("Enter the Position for :" + p2.playerName);
                    String pos2 = scan.next();
                    System.out.println("Enter the coin");
                    String coin2 = scan.next();
                    if (coin2.charAt(0) == p2.coinClr) {
                        gb.move((int)(pos2.charAt(1)-48) , (int)(pos2.charAt(0)-64) , coin2);
                    }
                    else{
                        try{
                            throw new IllegalArgumentException("Invalid coin");
                        }catch(Exception e){
                            e.getMessage();
                            continue;
                        }
                    }
                    if (gb.checkWon(p2)) {
                        System.out.println(p2.playerName +"   " + "Won!!!");
                        System.exit(0);
                    }
                }
            }
        }
    }

    
    // Game_Board gb = new Game_Board();

    public int boardSize(){
        System.out.println("Enter the Board Size");
        int n = scan.nextInt();
        return n;
    }

    // public char chooseColorForPlayer1(){
    //     System.out.println("Choose the coin color for Player 1");
    //     String color = scan.next();
    //     return color.charAt(0);
    // }

    // public char chooseColorForPlayer2(){
    //     System.out.println("Choose the coin color for Player 2");
    //     String color = scan.next();
    //     return color.charAt(0);
    // }

	// public void play(){
    //   player1();
    // }

    // int count1 = 1;
    // int count2 = 1;
    // private void player1(){
    //     char coinCheck = ' ';
    //     if (count1 == 1) {
    //         coinCheck = chooseColorForPlayer1();
    //     }
    //     while (count1 != 6) {
            
    //         System.out.println("Player1 turn :");
    //         System.out.println("Enter the Position");
    //         String pos = scan.next();
    //         System.out.println("Enter the coin");
    //         String coin = scan.next();
    //         if (coin.charAt(0) == coinCheck) {
    //             gb.move( (int)(pos.charAt(1)-48) , (int)(pos.charAt(0)-64) , coin);
    //         }
    //         else{
    //             System.out.println("Invalid Coin");
    //         }
    //         count1++;
    //         player2();
    //     }
    // }

    // private void player2(){
    //     char coinCheck = ' ';
    //     if (count1 == 1) {
    //         coinCheck = chooseColorForPlayer2();
    //     }
    //     while (count2 != 6) {

    //         System.out.println("Player2 turn :");
    //         System.out.println("Enter the Position");
    //         String pos = scan.next();
    //         System.out.println("Enter the coin");
    //         String coin = scan.next();
    //         if (coin.charAt(0) == coinCheck) {
    //             gb.move( (int)(pos.charAt(1)-48) , (int)(pos.charAt(0)-64) , coin);
    //         }
    //         count2++;
    //         player1();
    //     }
    // }
}