package First_Smst_Java.Live_Coding.Live;
import java.util.*;
public class Navigasi_Rev {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int b1a,b1b,b2a,b2b,US,BT;
        String alamat1, alamat2,blok1a,blok1b,blok2a,blok2b;

        alamat1 = input.next();
        alamat2 = input.next();

        blok1a = alamat1.substring(1,3); //Alamat ke 1 bagian A
        blok1b = alamat1.substring(5,7); //Alamat ke 1 bagian B
        blok2a = alamat2.substring(1,3); //Alamat ke 2 bagian A
        blok2b = alamat2.substring(5,7); //Alamat ke 2 bagian B

        b1a = Integer.parseInt(blok1a);
        b1b = Integer.parseInt(blok1b);
        b2a = Integer.parseInt(blok2a);
        b2b = Integer.parseInt(blok2b);

        //Menghitung Langkah
        BT = Math.abs(b1a - b2a);
        US = Math.abs(b1b - b2b);

        if (b1a < b2a){
            if (b1b < b2b){
                System.out.printf("%d langkah ke Barat dan %d langkah ke Selatan",BT,US);
            }else{
                System.out.printf("%d langkah ke Barat dan %d langkah ke Utara",BT,US);
            }

        }else if (b1b < b2b){
            System.out.printf("%d langkah ke Timur dan %d langkah ke Selatan",BT,US);
        }else{
            System.out.printf("%d langkah ke Timur dan %d langkah ke Utara",BT,US);
        }
    }
}
