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
            String kalimat_baru_1 = kalimat.replaceAll("yang","yg");
            String kalimat_baru_2 = kalimat_baru_1.replaceAll("enggak bisa","gbs");
            String kalimat_baru_3 = kalimat_baru_2.replaceAll("enggak","g");
            String kalimat_baru_4 = kalimat_baru_3.replaceAll("bisa","bs");

            System.out.println(kalimat_baru_4);
        }

    }
}