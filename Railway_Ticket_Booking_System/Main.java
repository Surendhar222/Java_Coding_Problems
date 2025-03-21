package Railway_Ticket_Booking_System;

import java.util.Scanner;

public class Main {
    public static void ticketBooking(Passenger p){
        TicketBook tb = new TicketBook();
       // if ((p.getBp().equals("L") && TicketBook.getALb() > 0) || (p.getBp().equals("M") && TicketBook.getAMb() > 0) || (p.getBp().equals("U") && TicketBook.getAUb() > 0)) {
            if(p.getBp().equals("L")){
                System.out.println("Lower Berth Given");
                tb.bookTicket(p , TicketBook.Lb.get(0) , "L");
                TicketBook.Lb.remove(0);
                int set = TicketBook.getALb();
                TicketBook.setALb(set-1);
            }
             else if(p.getBp().equals("M") && TicketBook.getAMb() > 0){
                System.out.println("Middle Berth Given");
                tb.bookTicket(p , TicketBook.Mb.get(0) , "M");
                TicketBook.Mb.remove(0);
                int set = TicketBook.getAMb();
                TicketBook.setAMb(set-1);
            }
             else if(p.getBp().equals("U") && TicketBook.getAUb() > 0){
                System.out.println("Upper Berth Given");
                tb.bookTicket(p , TicketBook.Ub.get(0) , "U");
                TicketBook.Ub.remove(0);
                int set = TicketBook.getAUb();
                TicketBook.setAUb(set-1);
            }
            else if(TicketBook.getALb() > 0){
                System.out.println("Lower Berth Given");
                tb.bookTicket(p , TicketBook.Lb.get(0) , "L");
                TicketBook.Lb.remove(0);
                int set = TicketBook.getALb();
                TicketBook.setALb(set-1);
            }

            else if(TicketBook.getAMb() > 0){
                System.out.println("Middle Berth Given");
                tb.bookTicket(p , TicketBook.Mb.get(0) , "M");
                TicketBook.Mb.remove(0);
                int set = TicketBook.getAMb();
                TicketBook.setAMb(set-1);
            }
             else if(TicketBook.getAUb() > 0){
                System.out.println("Upper Berth Given");
                tb.bookTicket(p , TicketBook.Ub.get(0) , "U");
                TicketBook.Ub.remove(0);
                int set = TicketBook.getAUb();
                TicketBook.setAUb(set-1);
            }
            else if (TicketBook.getARac() > 0) {
                System.out.println("RAC Given");
                tb.bookRacTicket(p, TicketBook.RAC.get(0), "RAC");
                TicketBook.RAC.remove(0);
                int set = TicketBook.getARac();
                TicketBook.setARac(set-1);
            }
            else if (TicketBook.getAWl() > 0) {
                System.out.println("Waiting List Given");
                tb.bookRacTicket(p, TicketBook.WL.get(0), "WL");
                TicketBook.WL.remove(0);
                int set = TicketBook.getAWl();
                TicketBook.setAWl(set-1);
            }
      //  }
            public static void cancelTicket(int id){
                if(!tb.passenger_data.containsKey(id)){
                    System.out.println("Passenger's ID Not Found");
                }
                else{
                    
                }
    }
    }
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("1.Book Ticket \n2.Cancel Ticket \n3.Print Booked Tickets \n4.Print AVailable Tickets");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    if(TicketBook.getAWl() != 0){
                        System.out.println("Enter Your Name");
                        String name = scan.next();
                        System.out.println("Enter your Age");
                        int age = scan.nextInt();
                        System.out.println("Enter your Gender [M , F]");
                        String gender = scan.next();
                        System.out.println("Enter your Berth Position [L , M , U]");
                        String bp = scan.next();
                        Passenger p = new Passenger(name , age , gender , bp);
                        ticketBooking(p);
                    }
                    else{
                        System.out.println("Sorry No Tickets Available");
                    }
                    break;

                case 2:
                    System.out.println("Enter your Passenger ID");
                    int id = scan.nextInt();
                    cancelTicket(id);
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
    
}