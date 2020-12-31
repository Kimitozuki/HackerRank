package First_Smst_Java.Any;
import java.util.*;
public class Cashier {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int money = input.nextInt();
        int code = input.nextInt();

        int price = 0;
        switch (code){
            case 1:
                price = 15000;break;
            case 2:
                price = 25000;break;
            case 3:
                price = 30000;break;
        }
        if(money == price){
            System.out.println("Tidak mendapatkan kembalian");
        }else if(money < price){
            System.out.println("Uang anda belum cukup");
        }else  if(money > price){
            System.out.println("Anda mendapatkan kembalian sebesar");
            int change = money - price;

            int loop = 0,check = change;
            while (check >= 10000){
                check = check - 10000;
                loop++;
            }
            System.out.printf("%d uang 10.000 \n",loop);

            loop = 0;
            while (check >= 1000){
                check = check - 1000;
                loop++;
            }
            System.out.printf("%d uang 1.000 \n",loop);
            loop = 0;
            while (check >= 500){
                check = check - 500;
                loop++;
            }
            System.out.printf("%d uang 500 \n",loop);

            loop = 0;
            while (check >= 100){
                check = check - 100;
                loop++;
            }
            System.out.printf("%d uang 100 \n",loop);
        }
    }
}
