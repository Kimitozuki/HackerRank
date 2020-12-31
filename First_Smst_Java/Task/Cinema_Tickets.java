package First_Smst_Java.Task;
import java.util.Scanner;
public class Cinema_Tickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ticketPrice = input.nextInt();
        int memPrice = input.nextInt();
        int ticket = 1, totalPrice, totalPriceMem;

        while(true){
            totalPrice = ticket * ticketPrice;
            totalPriceMem = (int)(totalPrice * 0.85 + memPrice);
            if(totalPrice > totalPriceMem){
                break;
            }else{
                ticket++;
            }
        }
        System.out.println(ticket);
    }
}
