package Banking_Application.Customer;

import java.io.IOException;
import java.util.Scanner;

import Banking_Application.Bank.Bank;

public class CustomerHandler {
	
    public void addNewCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = in.next();
        
        System.out.println("Enter New PassWord");
        String passwd = in.next();

        System.out.println("Re-Enter New PassWord");
        String duplicatePasswd = in.next();

        if (!passwd.equals(duplicatePasswd)) {
            System.out.println("Can not Create Account : Password Mismatch");
            return;
        }
        
        Bank.refCustId++;
        Bank.refAccNo++;

        Customer customer = new Customer(
            Bank.refCustId,
            Bank.refAccNo,
            name,
            Bank.initialAmount,
            passwd
        );
        
        CustomerFileHandler.getInstance().list.add(customer);
        
        try {
            CustomerFileHandler.getInstance().writeToFile(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}