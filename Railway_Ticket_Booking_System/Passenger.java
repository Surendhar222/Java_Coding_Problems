package Railway_Ticket_Booking_System;

public class Passenger {
	static int id = 1;
    private String name;
    private int age;
    private String gender;
    private String bp;
    private int Passenger_id;
    private String alloted = " ";
    private int number = -1;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

     public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

     public String getBp(){
        return this.name;
    }

    public void setBp(String bp){
        this.bp = bp;
    }

    public int getPassenger_id(){
        return Passenger_id;
    }

     public String getAlloted(){
        return this.alloted;
    }

    public void setAlloted(String alloted){
        this.alloted = alloted;
    }

     public int getNumber(){
        return this.number;
    }

    public void setnumber(int number){
        this.number = number;
    }


    Passenger(String name , int age , String gender , String bp){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bp = bp;
        Passenger_id = id++;
    }
}