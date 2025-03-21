package Banking_Application;

import Banking_Application.Bank.Bank;
import Banking_Application.Customer.CustomerFileHandler;
import Banking_Application.Customer.CustomerHandler;

public class Main {
	public static void main(String[] args) {
        CustomerFileHandler handler = new CustomerFileHandler();
        try {
            handler.initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        CustomerHandler c = new CustomerHandler();
        c.addNewCustomer();
    }
}