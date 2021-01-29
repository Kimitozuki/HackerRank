package First_Smst_Java.Any;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Cal_StockPrice {
    //https://www.hackerrank.com/contests/latihan-bleh/challenges/hitung-harga-saham
    //https://www.w3schools.com/java/java_encapsulation.asp
    //DILARANG MENGEDIT MAIN CLASS!
    private static final Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Saham T =new Saham();

        T.setHargaSaham(scan.nextInt());
        T.setLembarSaham(scan.nextInt());
        T.setFeeBeli(scan.nextDouble());

        T.getHargaTotal();
    }
}
class Saham {
    private int priceSheet;
    private int shareSheet;
    private double fee;
    
    public void setHargaSaham(int newPriceSheet){this.priceSheet = newPriceSheet;}
    public void setLembarSaham(int newShareSheet){this.shareSheet = newShareSheet;}
    public void setFeeBeli(double newFee){this.fee = newFee;}

    public void getHargaTotal(){
        int price = priceSheet * (shareSheet * 100);
        double tPrice = price + (price * fee / 100);
        DecimalFormat idrCurr = new DecimalFormat("#,###.00");
        System.out.println("Rp " + idrCurr.format(tPrice));
    }
}