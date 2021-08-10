package orderpkg;

import java.util.ArrayList;
import java.util.Iterator;
import cdpkg.CompactDisc;

public class Order {
    private String orderID;
    private String cusID;
    private String cusName;
    private int quantity;
    private double payableAmt;

    public Order(){
        orderID = "";
        cusID = "";
        cusName = "";
        quantity = 0;
    }

    public Order(String orderID,String cusID, String cusName, int quantity){
        this.orderID = orderID;
        this.cusID = cusID;
        this.cusName = cusName;
        this.quantity = quantity;
    }

    private ArrayList orderDetails = new ArrayList();
    public void addOrderDetails(String[] details){
        for (int i=0;i<details.length;i++){
            orderDetails.add(details[i]);
        }
    }

    

    public void displayOrderDetails(){
        System.out.println("Order ID\tCustomer ID\tCustomer Name\tQuantity\tPayable Amount");
        System.out.println("----------------------------------------------");
        Iterator iOrder = orderDetails.iterator();
        while(iOrder.hasNext()){
            System.out.print(iOrder.next()+"\t");
        }
        //System.out.print(payableAmount());
    }

}

