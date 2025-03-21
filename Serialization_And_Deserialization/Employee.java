package Serialization_And_Deserialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID= 1L;

	int empId;
    String empName;
    int empAge;
    transient Address address;

    public Employee(int id , String name , int age){
        this.empId = id;
        this.empName = name;
        this.empAge = age;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    
    private void writeObject(ObjectOutputStream object) throws IOException , ClassNotFoundException{
        object.defaultWriteObject();
        object.writeInt(address.doorNo);
        object.writeObject(address.streetName);
        System.out.println("hii");
    }

    private void readObject(ObjectInputStream object) throws IOException , ClassNotFoundException{ 
        object.defaultReadObject();
        int doorNo = object.readInt();
        String streetName = (String)object.readObject();
        this.address = new Address(doorNo, streetName, 0);
        System.out.println("hello");
    }
}