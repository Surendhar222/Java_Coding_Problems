package oops_Evaluation1;

public abstract class Withdraw extends Bank implements Services{
     private int wAmt;
    Withdraw(String name , int phoneNum , String gmail , int amt){
        super(name , phoneNum , gmail , amt);
        this.wAmt = amt;
    }
    	
}