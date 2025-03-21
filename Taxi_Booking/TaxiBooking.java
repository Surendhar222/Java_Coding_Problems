package Taxi_Booking;

import java.util.ArrayList;
import java.util.List;

public class TaxiBooking {
	public static List<Taxi> taxiList = new ArrayList<Taxi>();
    public static int taxiLimit = 4 , idgenerator = 1;
    public static List<Taxi> bookHistory = new ArrayList<Taxi>();

    public static void booking(char pickupLocation , char dropLocation , int pickupTime)throws CloneNotSupportedException{
        if(taxiList.size() < taxiLimit){
           taxiList.add(new Taxi());
        }
        int min = Integer.MAX_VALUE;
        Taxi taxiReady = null;
        for (Taxi t : taxiList) {
            if(t.getDropTime() <= pickupTime && Math.abs(t.getCurrentLocation() - pickupLocation) <= min ){
                if(Math.abs(t.getCurrentLocation() - pickupLocation) == min){
                    if (taxiReady != null && t.getEarnings() < taxiReady.getEarnings()) {
                        taxiReady = t;
                    }
                }
                else{
                    taxiReady = t;
                    min = Math.abs(pickupLocation - t.getCurrentLocation());
                }
            }
        }

        if (taxiReady != null) {
        taxiReady.setCurrentLocation(dropLocation);
        taxiReady.setPassengerId(idgenerator++);
        taxiReady.setPickupLocation(pickupLocation);
        taxiReady.setDropLocation(dropLocation);
        taxiReady.setPickupTime(pickupTime);
        taxiReady.setDropTime(pickupTime+Math.abs(dropLocation - pickupLocation));
        taxiReady.setTaxiId(taxiList.indexOf(taxiReady)+1);
        taxiReady.setEarnings(taxiReady.getEarnings() + (Math.abs(dropLocation-pickupLocation)*15-5)*10 + 100);
        bookHistory.add((Taxi)taxiReady.clone());
    }
    }
}