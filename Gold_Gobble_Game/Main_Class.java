package Gold_Gobble_Game;

public class Main_Class {

    static Game_Board gb = new Game_Board();
    static Gold_Gobble gg = new Gold_Gobble();
	public static void main(String[] args) {
        gb.initializeBoard();
        gg.start();
    }
}