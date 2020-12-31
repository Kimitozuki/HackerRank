package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Navigasi_Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alamat1,alamat2,blok1a,blok1b,blok2a,blok2b;
        int BT, US;

        alamat1 = input.next();
        alamat2 = input.next();

        blok1a = alamat1.substring(1,3);
        blok1b = alamat1.substring(5,7);
        blok2a = alamat2.substring(1,3);
        blok2b = alamat2.substring(5,7);

        int b1a = Integer.parseInt(blok1a);
        int b1b = Integer.parseInt(blok1b);
        int b2a = Integer.parseInt(blok2a);
        int b2b = Integer.parseInt(blok2b);
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
