package BusResv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String PassengerName;
    int BusNo;
    Date date;

    public Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        PassengerName = sc.next();
        System.out.println("Enter the bus number: ");
        BusNo = sc.nextInt();
        System.out.println("Enter the date in dd-mm-yyyy format: ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings){
        int capacity = 0;
        for(Bus bus: buses){
            if(bus.getBusNo()==BusNo)
                capacity = bus.getCapacity();
        }

        int booked = 0;
        for(Booking b: bookings) {
            if(b.BusNo == BusNo && b.date.equals(date)) {
                booked++;
            }
        }

        return booked<capacity?true:false;
    }

    

}

