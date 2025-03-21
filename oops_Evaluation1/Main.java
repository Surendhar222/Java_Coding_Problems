package oops_Evaluation1;

import java.util.Scanner;

public class Main extends Bank{

    Main(){

    }

    Main(String name , int phoneNum , String gmail , int amt){
        super(name, phoneNum, gmail, amt);
    }
    
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean var = true;
        while(var){
        System.out.println("Enter the Option");
        System.out.println("\n1.Deposit\n2.WithDraw\n3.BalanceCheck\nExit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount for deposit");
                int dAmt = scan.nextInt();
                Main m = new Main("Surendhar" , 99650 , "surendhar" , dAmt);
                m.deposit();
                break;

            case 2:
                System.out.println("Enter the amt for withdraw");
                int wAmt = scan.nextInt();
                Main m1 = new Main("name", 9999, "gmail", wAmt);
                m1.withDraw();
                break;

            case 3:
                Main m2 = new Main();
                System.out.println(m2.balanceCheck());
                break;
            case 4 :
                var = false;
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
        }
    }

    @Override
    public int balanceCheck() {
       Customer c = new Customer();
       return c.getBalance();
    }
}