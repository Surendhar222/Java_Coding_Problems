package Banking_Application.Customer;

public class Customer {
    
    public static final String SPACES = " ";

	public int id;
    public int accNo;
    public String name;
    public int balance;
    public String passwd;

    public Customer(int id , int accNo , String name , int balance , String passwd){
        this.id = id;
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.passwd = passwd;
    }

    public String toString(){
        return id + SPACES 
        + accNo + SPACES 
            + name + SPACES 
              + balance + SPACES 
                + passwd;
    }
}