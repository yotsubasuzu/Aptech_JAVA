import java.util.*;

public class NetPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input package delivered: ");
        int packageDelivered = input.nextInt();
        ///int distanceTraveled;
        System.out.println("Permanent employee: true or false");
        boolean permanentEmployee = input.nextBoolean();
        //double shifts = 0.1;
        double pay;
        System.out.println("Input grade (A1, A2, A3): ");
        String grade = "A1";
        
        switch (grade){
            case "A1":
            if(permanentEmployee){
                pay = ((50*packageDelivered + 75)*1.1)*1.05;
                System.out.println("Net pay: " + pay);
                break;
            }
                
            else{
                pay = ((50*packageDelivered + 75)*1.1)*1.05;
                System.out.println("Net pay: " + pay);
                break;
            }
                
            case "A2":
            if(permanentEmployee){
                pay = ((50*packageDelivered + 75)*1.1)*1.1;
                System.out.println("Net pay: " + pay);
                break;
            }
                
            else{
                pay = ((50*packageDelivered + 75)*1.1)*1.1;
                System.out.println("Net pay: " + pay);
                break;
            }

            case "A3":
            if(permanentEmployee){
                pay = ((50*packageDelivered + 75)*1.1)*1.15;
                System.out.println("Net pay: " + pay);
                break;
            }
                
            else{
                pay = ((50*packageDelivered + 75)*1.1)*1.15;
                System.out.println("Net pay: " + pay);
                break;
            }
            default:
                System.out.println("Nhap muc thuong");
        }
    }
}
