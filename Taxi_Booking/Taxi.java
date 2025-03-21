package Taxi_Booking;

public class Taxi implements Cloneable {
	private char currentLocation;
    private int passengerId;
    private int taxiId;
    private char pickupLocation;
    private char dropLocation;
    private int pickupTime;
    private int dropTime;
    private int earnings;
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public char getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(char currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }

    public char getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(char pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public char getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(char dropLocation) {
        this.dropLocation = dropLocation;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(int pickupTime) {
        this.pickupTime = pickupTime;
    }

    public int getDropTime() {
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
}