package First_Smst_Java.Live_Coding.Live;
import java.util.*;
public class Apakah_Telat {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // 4,5km = 4500m
        // 10 menit = 600 detik

        float v_awal,v_akhir,perjalanan;
        boolean cek;

        v_awal = input.nextFloat();
        v_akhir = input.nextFloat();
        perjalanan = (2*4500)/(v_awal + v_akhir);
        cek = (perjalanan > 600);
        System.out.println(cek);
    }
}

