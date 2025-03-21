package oops_Evaluation1;

public class Customer{
	private String name;
    private int PhoneNum;
    private String gmail;
    private static int balance = 1000;
    
    public Customer(String name , int PhoneNum , String gmail , int balance){
        this.name = name;
        this.PhoneNum = PhoneNum;
        this.gmail = gmail;
        this.balance = balance;
    }
    Customer(){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPhoneNumber(){
        return this.PhoneNum;
    }

    public void setPhoneNumber(int num){
        this.PhoneNum = num;
    }

    public String getGmail(){
        return this.gmail;
    }

    public void setGmail(String mail){
        this.gmail = mail;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
}