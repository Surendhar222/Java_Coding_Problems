package CSV_File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSV_Writer {

	public static void main(String[] args) throws IOException {
        System.out.println("Start Writing.................");
        
        // File file = new File(System.getProperty("user.dir")+"\\CSV_File_Handling\\Employee.csv");
        String path = "file:///home/workspace/Test/src/CSV_File_Handling/Employee.csv";

        FileWriter Writer = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(Writer);


        bufferedWriter.append("Emp_ID , Emp_Name , Emp_Age");
        bufferedWriter.append("2001 , Surendhar , 23");
        bufferedWriter.append("2002 , Sathish , 23");
        bufferedWriter.append("2003 , Gnanaguru , 23");
        bufferedWriter.append("2004 , Sakthi Venkatesh , 22");
        bufferedWriter.append("2005 , Jaya Raj , 25");

        bufferedWriter.close();
        System.out.println("Writed SuccessFully...........");
        
    }
}