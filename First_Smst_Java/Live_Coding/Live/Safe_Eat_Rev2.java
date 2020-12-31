package First_Smst_Java.Live_Coding.Live;
import java.util.*;
public class Safe_Eat_Rev2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bulan_beli, bulan_konsumsi;
        int tgl_beli, tgl_konsumsi;

        tgl_beli = input.nextInt();
        bulan_beli = input.next();
        tgl_konsumsi = input.nextInt();
        bulan_konsumsi = input.next();

        if (bulan_beli.contains(bulan_konsumsi)){
            System.out.println("Segar");
        }else{
            int bulan_beli_ke = 0;
            switch (bulan_beli){
                case "Januari":
                    bulan_beli_ke = 1;
                    break;
                case "Februari":
                    bulan_beli_ke = 2;
                    break;
                case "Maret":
                    bulan_beli_ke = 3;
                    break;
                case "April":
                    bulan_beli_ke = 4;
                    break;
                case "Mei":
                    bulan_beli_ke = 5;
                    break;
                case "Juni":
                    bulan_beli_ke = 6;
                    break;
                case "Juli":
                    bulan_beli_ke = 7;
                    break;
                case "Agustus":
                    bulan_beli_ke = 8;
                    break;
                case "September":
                    bulan_beli_ke = 9;
                    break;
                case "Oktober":
                    bulan_beli_ke = 10;
                    break;
                case "November":
                    bulan_beli_ke = 11;
                    break;
                case "Desember":
                    bulan_beli_ke = 12;
                    break;
            }
            int bulan_konsumsi_ke = 0;
            switch (bulan_konsumsi){
                case "Januari":
                    bulan_konsumsi_ke = 1;
                    break;
                case "Februari":
                    bulan_konsumsi_ke = 2;
                    break;
                case "Maret":
                    bulan_konsumsi_ke = 3;
                    break;
                case "April":
                    bulan_konsumsi_ke = 4;
                    break;
                case "Mei":
                    bulan_konsumsi_ke = 5;
                    break;
                case "Juni":
                    bulan_konsumsi_ke = 6;
                    break;
                case "Juli":
                    bulan_konsumsi_ke = 7;
                    break;
                case "Agustus":
                    bulan_konsumsi_ke = 8;
                    break;
                case "September":
                    bulan_konsumsi_ke = 9;
                    break;
                case "Oktober":
                    bulan_konsumsi_ke = 10;
                    break;
                case "November":
                    bulan_konsumsi_ke = 11;
                    break;
                case "Desember":
                    bulan_konsumsi_ke = 12;
                    break;
            }

            int jarak_bulan, hari_beli, hari_konsumsi, total_hari;
            hari_konsumsi = tgl_konsumsi;
            hari_beli = 30 - tgl_beli;
            int reset = (bulan_konsumsi_ke < bulan_beli_ke) ? 12 : 0;
            jarak_bulan = (bulan_konsumsi_ke + reset) - bulan_beli_ke;
            switch (jarak_bulan) {
                case 1:
                    total_hari = hari_beli + hari_konsumsi;
                    if (total_hari <= 30) {
                        System.out.println("Segar");
                    } else {
                        System.out.println("Setengah layu");
                    }
                    break;
                case 2:
                    System.out.println("Setengah layu");
                    break;
                case 3:
                    total_hari = hari_beli + 60 + hari_konsumsi;
                    if (total_hari <= 90) {
                        System.out.println("Setengah layu");
                    } else {
                        System.out.println("Basi");
                    }
                    break;
                default:
                    System.out.println("Basi");
                    break;
            }
        }
    }
}
