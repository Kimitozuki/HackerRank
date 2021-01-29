package First_Smst_Java.Any;
import java.util.Scanner;
public class Arithmeth {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai_awal, nilai_akhir, penambahan, hasil_akhir;

        System.out.print("Masukan nilai awal -> ");
        nilai_awal = input.nextInt();
        System.out.print("Masukan nilai akhir -> ");
        nilai_akhir = input.nextInt();
        penambahan = nilai_awal;
        hasil_akhir = nilai_awal;
        input.close();
        for( ;(nilai_awal < nilai_akhir); nilai_awal++){
           ++penambahan;
           hasil_akhir = hasil_akhir + penambahan;
            System.out.println(hasil_akhir);
        }
    }
}
