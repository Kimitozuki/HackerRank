package First_Smst_Java.Live_Coding.Live;
import java.util.*;
public class Kartu_Studi {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        float ip;
        int nilai1,nilai2,sks1,sks2;
        String matkul1, matkul2;

        matkul1 = input.nextLine();
        matkul2 = input.nextLine();

        //Filter Nilai Matkul 1
        Scanner filter1 = new Scanner (matkul1);
        filter1.useDelimiter("[^0-9]+");
        String temp1 = filter1.next();
        String temp2 = filter1.next();

        //Filter Nilai Matkul 2
        Scanner filter2 = new Scanner (matkul2);
        filter2.useDelimiter("[^0-9]+");
        String temp3 = filter2.next();
        String temp4 = filter2.next();

        //Filter Nama Matkul 1
        Scanner filter3 = new Scanner (matkul1);
        filter3.useDelimiter("[^A-Za-z ]+");
        String NamaMatkul1 = filter3.next();

        //Filter Nama Matkul 2
        Scanner filter4 = new Scanner (matkul2);
        filter4.useDelimiter("[^A-Za-z ]+");
        String NamaMatkul2 = filter4.next();

        nilai1 = Integer.parseInt(temp1);
        sks1 = Integer.parseInt(temp2);
        nilai2= Integer.parseInt(temp3);
        sks2 = Integer.parseInt(temp4);

        ip =(float)(nilai1*sks1+nilai2*sks2)/(sks1+sks2);

        System.out.println("          KARTU HASIL STUDI          ");
        System.out.println("=====================================");
        System.out.printf("%-23s %5s %7s\n","MATA KULIAH", "NILAI", "SKS");
        System.out.printf("%-23S %5d %7d\n",NamaMatkul1,nilai1,sks1);
        System.out.printf("%-23S %5d %7d\n",NamaMatkul2,nilai2,sks2);
        System.out.println("=====================================");
        System.out.printf("%-24S %.2f", "ip",ip);
    }
}

