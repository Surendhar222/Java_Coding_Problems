package Gold_Gobble_Game;

import java.util.Scanner;

public class Player {
	 String playerName;
     char coinClr;

    public Player(String name , char clr){
        this.playerName = name;
        this.coinClr = clr;
    }

    Scanner scan = new Scanner(System.in);

    // public void coinPic(){
    //     System.out.println("Enter your Name : ");
    //     this.playerName = scan.next();
    //     System.out.println("Enter your Coin Color");
    //     this.coinClr = scan.next().charAt(0);
    // }
}