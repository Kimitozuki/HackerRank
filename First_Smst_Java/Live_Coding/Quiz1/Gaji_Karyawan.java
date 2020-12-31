package Quiz1;
import java.util.Scanner;
public class Gaji_Karyawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan golongan:");
        int golongan = input.nextInt();
        System.out.println("Masukan jam kerja minggu-1:");
        int minggu1 = input.nextInt();
        System.out.println("Masukan jam kerja minggu-2:");
        int minggu2 = input.nextInt();
        System.out.println("Masukan jam kerja minggu-3:");
        int minggu3 = input.nextInt();
        System.out.println("Masukan jam kerja minggu-4:");
        int minggu4 = input.nextInt();

        float gaji1, gaji2, gaji3, gaji4;
        int tambahan,upah = 0;
        switch (golongan){
            case 1:
                upah = 3000;
                break;
            case 2:
                upah = 3500;
                break;
            case 3:
                upah = 4000;
                break;
            case 4:
                upah = 5000;
                break;
        }
        //Minggu ke 1
        if (minggu1 > 40){
            tambahan = minggu1 - 40;
            gaji1 = (float) 40*upah + tambahan * (upah + upah/2);
        }else {
            gaji1 = (float) minggu1 * upah;
        }
        //Minggu ke 2
        if (minggu2 > 40){
            tambahan = minggu2 - 40;
            gaji2 = (float) 40*upah + tambahan * (upah + upah/2);
        }else {
            gaji2 = (float) minggu2 * upah;
        }
        //Minggu ke 3
        if (minggu3 > 40){
            tambahan = minggu3 - 40;
            gaji3 = (float) 40*upah + tambahan * (upah + upah/2);
        }else {
            gaji3 = (float) minggu3 * upah;
        }
        //Minggu ke 4
        if (minggu4 > 40){
            tambahan = minggu4 - 40;
            gaji4 = (float) 40*upah + tambahan * (upah + upah/2);
        }else {
            gaji4 = (float) minggu4 * upah;
        }
        float total = gaji1 + gaji2 + gaji3 + gaji4;
        System.out.printf("Gaji = %.1f",total);
    }
}
