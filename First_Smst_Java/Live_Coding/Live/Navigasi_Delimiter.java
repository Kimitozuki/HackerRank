package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Navigasi_Delimiter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alamat1,alamat2;
        int BT, US;

        alamat1 = input.next();
        alamat2 = input.next();

        Scanner filter1 = new Scanner (alamat1);
        filter1.useDelimiter("[^0-9]+");
        String temp1 = filter1.next();
        String temp2 = filter1.next();

        Scanner filter2 = new Scanner (alamat2);
        filter2.useDelimiter("[^0-9]+");
        String temp3 = filter2.next();
        String temp4 = filter2.next();


        int b1a = Integer.parseInt(temp1);
        int b1b = Integer.parseInt(temp2);
        int b2a = Integer.parseInt(temp3);
        int b2b = Integer.parseInt(temp4);
        BT = b1a - b2a;
        US = b1b - b2b;

        if (BT < 0){
            if (US < 0){
                System.out.printf("%d langkah ke Barat dan %d langkah ke Selatan",Math.abs(BT),Math.abs(US));
            }else{
                System.out.printf("%d langkah ke Barat dan %d langkah ke Utara",Math.abs(BT),US);
            }
        }else if (US < 0){
            System.out.printf("%d langkah ke Timur dan %d langkah ke Selatan",BT,Math.abs(US));
        }else{
            System.out.printf("%d langkah ke Timur dan %d langkah ke Utara",BT,US);
        }
    }
}
