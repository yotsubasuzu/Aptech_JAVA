package orderpkg;

import java.util.Scanner;

import cdpkg.CompactDisc;

public class BuyCD {
    public static void main(String[] args) {
        String[] cdDetails = new String[3];
        String[] orderDetails = new String[4];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter CD ID:");
        cdDetails[0] = input.nextLine();
        System.out.println("Enter CD Type:");
        cdDetails[1] = input.nextLine();
        System.out.println("Enter Artist: ");
        cdDetails[2] = input.nextLine();

        System.out.println("Enter Order ID:");
        orderDetails[0] = input.nextLine();
        System.out.println("Enter Customer ID:");
        orderDetails[1] = input.nextLine();
        System.out.println("Enter Customer Name:");
        orderDetails[2] = input.nextLine();
        System.out.println("Enter Quantity:");
        orderDetails[3] = input.nextLine();

        System.out.println("----------------------------------------------");
        CompactDisc cd1 = new CompactDisc();
        cd1.addCDDetails(cdDetails);
        cd1.displayCDDetails();
        System.out.println("----------------------------------------------");
        Order order1 = new Order();
        order1.addOrderDetails(orderDetails);
        order1.displayOrderDetails();
        System.out.print(CompactDisc.price * Integer.parseInt(orderDetails[3].trim()) * CompactDisc.discount);
        System.out.println("");
    }
}
