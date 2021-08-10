package cdpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class CompactDisc {
    private String id;
    private String type;
    private String artist;
    public static double price = 99.99;
    
    public static final float discount = 0.1F;

    private ArrayList cdDetails = new ArrayList();

    public CompactDisc(){
        id = "";
        type = "";
        artist = "";
    }

    public CompactDisc(String id, String type, String artist, double price){
      this.id = id;
      this.type = type;
      this.artist = artist;
    }

    public void addCDDetails(String[] details){
        for (int i=0;i<details.length;i++){
            cdDetails.add(details[i]);
        }
    }

    public void displayCDDetails(){
        System.out.println("CD Details:");
        System.out.println("ID\tType\tArtist\tPrice\tDiscount");
        System.out.println("----------------------------------------------");
        Iterator iCD = cdDetails.iterator();
        while(iCD.hasNext()){
            System.out.print(iCD.next()+"\t");
        }

        System.out.print(price +"\t");
        System.out.print(discount);
        System.out.println("");
    }
}
