package First_Smst_Java.Live_Coding.Live;
import java.util.*;
public class Pesan_Pendek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();
        int jumlah_karakter = kalimat.length();

        if(jumlah_karakter < 50){
            System.out.println(kalimat);
        }else{
            String kalimat_baru = kalimat.replaceAll("yang","yg").replaceAll("enggak bisa","gbs").replaceAll("enggak","g").replaceAll("bisa","bs");

            System.out.println(kalimat_baru);
        }

    }
}