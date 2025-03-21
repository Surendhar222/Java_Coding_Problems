package oops_Evaluation1;

public abstract class Bank extends Customer implements Services{
    private int amt;
    public Bank(String name , int PhoneNum , String gmail , int balance){
        super(name , PhoneNum , gmail , balance);
        this.amt = balance;
    }
    Bank(){
        
    }
    public void deposit(){
            Customer c = new Customer();
            int availBal = c.getBalance();
            int set = availBal + amt;
            c.setBalance(set);
        }

        public void withDraw(){
            Customer c = new Customer();
            int availBal = c.getBalance();
            int set = availBal - amt;
            c.setBalance(set);
        }
}