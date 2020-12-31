package First_Smst_Java.Live_Coding.Mid_Exam;
import java.util.Scanner;
public class Disc_StoreX {
    public static void main(String[] args) {
        //https://www.hackerrank.com/contests/utp/challenges/utp-soal-2
        /*
        Constraints
        0 <= total pembelian <= max double
         */
        Scanner input = new Scanner(System.in);
        boolean mem = input.nextBoolean();
        double tprice = input.nextDouble();
        double discmem = mem ? tprice * 0.1 : 0;
        int fprice;
        if (tprice >= 0 && tprice < 100000){
            fprice = (int)(tprice - discmem);
            System.out.printf("Harga akhir = %d",fprice);
        }else if (tprice >= 100000 && tprice < 200000){
            fprice = (int)(tprice * 0.7 - discmem);
            System.out.printf("Harga akhir = %d",fprice);
        }else if (tprice >= 200000 && tprice < 300000){
            fprice = (int)(tprice * 0.6 - discmem);
            System.out.printf("Harga akhir = %d",fprice);
        }else if (tprice >= 300000 && tprice < Double.MAX_VALUE){
            fprice = (int)(tprice * 0.5 - discmem);
            System.out.printf("Harga akhir = %d",fprice);
        }
    }
}
