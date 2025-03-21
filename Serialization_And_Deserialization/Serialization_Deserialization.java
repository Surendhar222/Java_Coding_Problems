package Serialization_And_Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization_Deserialization {
    
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serialization();
        deserialization();
    }


    private static void serialization() throws IOException {
        Employee emp = new Employee(1, "Surendhar", 23);
        Address address = new Address(21, "South Street", 626136);
        emp.setAddress(address);
        FileOutputStream outputStream = new FileOutputStream("///home/workspace/Test/src/Serialization_And_Deserialization/Serialization.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(emp);
        System.out.println("Serialization Successfull..........");
        outputStream.close();
        objectOutputStream.close();
    }

    private static void deserialization() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("///home/workspace/Test/src/Serialization_And_Deserialization/Serialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Employee emp = (Employee)objectInputStream.readObject();
        inputStream.close();
        objectInputStream.close();
        System.out.println("Deserialization Completed.........");

        System.out.println(emp.empId);
        System.out.println(emp.empName);
        System.out.println(emp.empAge);
        System.out.println(emp.address.doorNo);
        System.out.println(emp.address.streetName);
        System.out.println(emp.address.pincode);
    }
}