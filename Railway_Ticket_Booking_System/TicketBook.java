package Railway_Ticket_Booking_System;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TicketBook {
	private static int aLb = 2;
    private static int aMb = 1;
    private static int aUb = 1;
    private static int aRac = 1;
    private static int aWl = 1;

    public static int getALb(){
        return aLb;
    }

    public static void setALb(int num){
        aLb = num;
    }

    public static int getAMb(){
        return aMb;
    }

    public static void setAMb(int num){
        aMb = num;
    }

    public static int getAUb(){
        return aUb;
    }

    public static void setAUb(int num){
        aUb = num;
    }

    public static int getARac(){
        return aRac;
    }

    public static void setARac(int num){
        aRac = num;
    }

    public static int getAWl(){
        return aWl;
    }

    public static void setAWl(int num){
        aWl = num;
    }

    static List <Integer> Lb = new ArrayList<Integer>(Arrays.asList(1,2));
    static List <Integer> Mb = new ArrayList<Integer>(Arrays.asList(1)); 
    static List <Integer> Ub = new ArrayList<Integer>(Arrays.asList(1));
    static List <Integer> RAC = new ArrayList<Integer>(Arrays.asList(1));
    static List <Integer> WL = new ArrayList<Integer>(Arrays.asList(1));

    static Queue<Integer> RacQueue = new LinkedList<Integer>();
    static Queue<Integer> WlQueue = new LinkedList<Integer>();
    static List<Integer> pass_id = new ArrayList<Integer>();
    static Map<Integer , Passenger> passenger_data = new HashMap<Integer , Passenger>();

    public void bookTicket(Passenger p , int number , String allotedBirth){
       p.setnumber(number);
       p.setAlloted(allotedBirth);
       pass_id.add(p.getPassenger_id());
       passenger_data.put(p.getPassenger_id(), p);   
       System.out.println("Passenger's_Id                 :"+p.getPassenger_id());
       System.out.println("Passenger's Name               :"+p.getName());
       System.out.println("Passenger's Age                :"+p.getAge());
       System.out.println("Passenger's Gender             :"+p.getGender());
       System.out.println("Passenger's Alloted Berth      :"+number+allotedBirth);
       System.out.println("Booked Successfully Thank You...");
       System.out.println();
    }

    public void bookRacTicket(Passenger p , int number , String racBerth){
       p.setnumber(number);
       p.setAlloted(racBerth);
       pass_id.add(p.getPassenger_id());
       passenger_data.put(p.getPassenger_id(), p);   
       System.out.println("Passenger's_Id                 :"+p.getPassenger_id());
       System.out.println("Passenger's Name               :"+p.getName());
       System.out.println("Passenger's Age                :"+p.getAge());
       System.out.println("Passenger's Gender             :"+p.getGender());
       System.out.println("Passenger's Alloted Berth      :"+number+racBerth);
       System.out.println("Booked Successfully Thank You...");
       System.out.println();
    }

    public void bookWlTicket(Passenger p , int number , String waitingList){
       p.setnumber(number);
       p.setAlloted(waitingList);
       pass_id.add(p.getPassenger_id());
       passenger_data.put(p.getPassenger_id(), p);   
       System.out.println("Passenger's_Id                 :"+p.getPassenger_id());
       System.out.println("Passenger's Name               :"+p.getName());
       System.out.println("Passenger's Age                :"+p.getAge());
       System.out.println("Passenger's Gender             :"+p.getGender());
       System.out.println("Passenger's Alloted Berth      :"+number+waitingList);
       System.out.println("Booked Successfully Thank You...");
       System.out.println();
    }

    public void cancelTicket(int id){
        Passenger p = passenger_data.get(id);
        int seatNumber = p.getNumber();
        System.out.println("Cancelled Successfully");
        if(p.getAlloted() == "L"){
            Lb.add(seatNumber);
            int set = getALb();
            setALb(set+1);
        }

        else if(p.getAlloted() == "M"){
            Mb.add(seatNumber);
            int set = getAMb();
            setAMb(set+1);
        }

        else if(p.getAlloted() == "U"){
            Ub.add(seatNumber);
            int set = getAUb();
            setAUb(set+1);
        }
    }

}