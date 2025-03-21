package oops_Evaluation1;

public abstract class Deposite extends Bank implements Services {
    private int dAmt;
    Deposite(String name , int phoneNum , String gmail , int amt){
        super(name , phoneNum , gmail , amt);
        this.dAmt = amt;
    }
    	
}