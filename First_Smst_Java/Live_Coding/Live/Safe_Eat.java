package First_Smst_Java.Live_Coding.Live;
import java.util.*;
public class Safe_Eat {
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

        if(bulan_beli.contains(bulan_konsumsi)){
            System.out.println("Segar");
        }else{
            int hari_bulan_awal, hari_bulan_akhir, hari_total;
            switch (bulan_beli){
                case "Januari":
                    switch (bulan_konsumsi){
                        case "Februari":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Maret":
                            System.out.println("Setengah layu");
                            break;
                        case "April":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "Februari":
                    switch (bulan_konsumsi){
                        case "Maret":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "April":
                            System.out.println("Setengah layu");
                            break;
                        case "Mei":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "Maret":
                    switch (bulan_konsumsi){
                        case "April":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Mei":
                            System.out.println("Setengah layu");
                            break;
                        case "Juni":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "April":
                    switch (bulan_konsumsi){
                        case "Mei":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Juni":
                            System.out.println("Setengah layu");
                            break;
                        case "Juli":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "Mei":
                    switch (bulan_konsumsi){
                        case "Juni":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Juli":
                            System.out.println("Setengah layu");
                            break;
                        case "Agustus":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "Juni":
                    switch (bulan_konsumsi){
                        case "Juli":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Agustus":
                            System.out.println("Setengah layu");
                            break;
                        case "September":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "Juli":
                    switch (bulan_konsumsi){
                        case "Agustus":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "September":
                            System.out.println("Setengah layu");
                            break;
                        case "Oktober":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "Agustus":
                    switch (bulan_konsumsi){
                        case "September":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Oktober":
                            System.out.println("Setengah layu");
                            break;
                        case "November":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "September":
                    switch (bulan_konsumsi){
                        case "Oktober":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "November":
                            System.out.println("Setengah layu");
                            break;
                        case "Desember":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "Oktober":
                    switch (bulan_konsumsi){
                        case "November":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Desember":
                            System.out.println("Setengah layu");
                            break;
                        case "Januari":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "November":
                    switch (bulan_konsumsi){
                        case "Desember":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Januari":
                            System.out.println("Setengah layu");
                            break;
                        case "Februari":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
                case "Desember":
                    switch (bulan_konsumsi){
                        case "Januari":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + hari_bulan_akhir;
                            if (hari_total <= 30){
                                System.out.println("Segar");
                            }else{
                                System.out.println("Setengah layu");
                            }
                            break;
                        case "Februari":
                            System.out.println("Setengah layu");
                            break;
                        case "Maret":
                            hari_bulan_awal = 30 - tgl_beli;
                            hari_bulan_akhir = tgl_konsumsi;
                            hari_total = hari_bulan_awal + 60 + hari_bulan_akhir;
                            if (hari_total < 90){
                                System.out.println("Setengah layu");
                            }else{
                                System.out.println("Basi");
                            }
                            break;
                        default:
                            System.out.println("Basi");
                            break;
                    }
                    break;
            }
        }
    }
}
