package Banking_Application.Customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Banking_Application.Bank.Bank;

public class CustomerFileHandler {
	
    private static final String FILE = "abc.txt";

    List<Customer> list = new ArrayList<>();
    static CustomerFileHandler instance;
    
    public static CustomerFileHandler getInstance(){
        if (instance == null) {
           instance = new CustomerFileHandler();
        }
        return instance;
    }

    public void initialize() throws IOException{

        BufferedReader reader = new BufferedReader(
        new FileReader(FILE)
    );
    String nextLine = reader.readLine();

    do {
        list.add(stringCastToCustomer(nextLine));
        nextLine = reader.readLine();
    } while (nextLine != null);

    reader.close();

    Bank.customerList = list;
    Bank.refCustId = list.get(list.size()-1).id;
    Bank.refAccNo = list.get(list.size()-1).accNo;
    }

    private Customer stringCastToCustomer(String nextLine){
        String[] cusInfo = nextLine.split(" ");

        Customer customer = new Customer(
            Integer.parseInt(cusInfo[0]),
            Integer.parseInt(cusInfo[1]),
            cusInfo[2],
            Integer.parseInt(cusInfo[3]),
            cusInfo[4]
        );
        return customer;
    }

    public void writeToFile(Customer customer) throws IOException{

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(
                new FileWriter(FILE , true)
            );

            writer.write("\n" + customer.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            writer.close();
        }
        
    }
}