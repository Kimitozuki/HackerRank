package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Check_Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int check, mod = 2;
        if(num != 5){
            mod = (num % 5) == 0 ? 5 : 2;
        }
        if(num == 2 || num == 3){
            System.out.println("Prima");
        }else{
            while(true){
                check = num % mod;
                if(check == 0){
                    System.out.println("Bukan Prima");
                    break;
                }else if(check != 0){
                    if((mod % 2) == 0){
                        mod++;
                        continue;
                    }else if((mod % 2) != 0){
                        System.out.println("Prima");
                        break;
                    }
                }
            }
        }
    }
}
