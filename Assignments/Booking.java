import java.util.*;

public class Booking {
    private String bookingID;
    private String departureDate;
    private int numberOfTickets;
    private int price;
    private String cabinType;
    private int totalPrice;
    private String destination;

    Scanner input = new Scanner(System.in);

    public Booking(String bookingID){
        this.bookingID = bookingID;
    }

    public int totalPrice(){
        return totalPrice = price*numberOfTickets;
    }

    public void setTicketInfo(){
        System.out.println("Input booking infomation: ");
        System.out.println("Departure Date: ");
        this.departureDate = input.nextLine();
        System.out.println("Number of Tickets: ");
        this.numberOfTickets = input.nextInt();
        System.out.println("Cabin Type: ");
        this.cabinType = input.nextLine();
        System.out.println("Destination: ");
        this.destination = input.nextLine();
        System.out.println("Price: ");
        this.price = input.nextInt();
    }

    public void ticketConfirmation(){
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Departure Date: " + departureDate);
        System.out.println("Destination: " + destination);
        System.out.println("Number of tickets: " + numberOfTickets);
        System.out.println("Cabin type: " + cabinType);
        System.out.println("Price: " + price);
        System.out.println("Total Price: " + price*numberOfTickets);
    }
}
