package Serialization_And_Deserialization;

import java.io.Serializable;

public class Address implements Serializable{
	int doorNo;
    String streetName;
    int pincode;

    public Address(int doorNo , String streetName , int pincode){
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.pincode = pincode;
    }
}