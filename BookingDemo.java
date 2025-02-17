package BusResv;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1,true,45));
        buses.add(new Bus(2,false,55));
        buses.add(new Bus(3,true,35));

        for(Bus b: buses){
            b.displayBusInfo();
        }
        
        Scanner sc = new Scanner(System.in); 
        int userOpt = 1;
        while(userOpt==1){
            System.out.println("Enter 1 to Book and Enter 2 to exit");
            userOpt = sc.nextInt();
            if(userOpt==1){
                Booking booking = new Booking();
                if(booking.isAvailable(buses, bookings)){
                    bookings.add(booking);
                    System.out.println("Congratulations " + booking.PassengerName + "!! Booking Successful");
                }
                else{
                    System.out.println("Sorry, the bus is full. Please try another bus or date");
                }
            }

        }
    }
}
