package First_Smst_Java.Live_Coding.Live;
import java.util.*;
public class Safe_Eat_Rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tanggal_beli, tanggal_konsumsi;

        tanggal_beli = input.nextLine();
        tanggal_konsumsi = input.nextLine();

        Scanner filter1 = new Scanner(tanggal_beli);
        filter1.useDelimiter("[^A-Za-z]+");
        String bulan_beli = filter1.next();
        Scanner filter2 = new Scanner(tanggal_beli);
        filter1.useDelimiter("[^0-9]+");
        String temp2 = filter2.next();
        int tgl_beli = Integer.parseInt(temp2);

        Scanner filter3 = new Scanner(tanggal_konsumsi);
        filter3.useDelimiter("[^A-Za-z]+");
        String bulan_konsumsi = filter3.next();
        Scanner filter4 = new Scanner(tanggal_konsumsi);
        filter4.useDelimiter("[^0-9]+");
        String temp4 = filter4.next();
        int tgl_konsumsi = Integer.parseInt(temp4);

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
            if (bulan_konsumsi_ke < bulan_beli_ke){
                jarak_bulan = bulan_beli_ke - (bulan_konsumsi_ke + 12);
                switch (jarak_bulan){
                    case 1:
                        total_hari = hari_beli + hari_konsumsi;
                        if (total_hari <= 30){
                            System.out.println("Segar");
                        }else{
                            System.out.println("Setengah layu");
                        }break;
                    case 2:
                        System.out.println("Setengah layu");
                        break;
                    case 3:
                        total_hari = hari_beli + 60 + hari_konsumsi;
                        if (total_hari <= 90){
                            System.out.println("Setengah layu");
                        }else{
                            System.out.println("Basi");
                        }break;
                    default:
                        System.out.println("Basi");
                        break;
                }
            }else{
                jarak_bulan = bulan_konsumsi_ke - bulan_beli_ke;
                switch (jarak_bulan){
                    case 1:
                        total_hari = hari_beli + hari_konsumsi;
                        if (total_hari <= 30){
                            System.out.println("Segar");
                        }else{
                            System.out.println("Setengah layu");
                        }break;
                    case 2:
                        System.out.println("Setengah layu");
                        break;
                    case 3:
                        total_hari = hari_beli + 60 + hari_konsumsi;
                        if (total_hari <= 90){
                            System.out.println("Setengah layu");
                        }else{
                            System.out.println("Basi");
                        }break;
                    default:
                        System.out.println("Basi");
                        break;
                }
            }
        }
    }
}
