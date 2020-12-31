package First_Smst_Java.Task;
import java.util.Scanner;
import java.util.ArrayList;
public class Simple_SIAM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/tugas-5-pemdas-si-a/challenges/siam-sederhana
        ArrayList nameList = new ArrayList();
        nameList.add("Budi");
        nameList.add("Joko");
        nameList.add("Susi");
        System.out.println("SIAM Sederhana");
        loop: while (true){
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Keluar");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    nameList.add(input.next());
                    break;
                case 2:
                    for(int index = 0; index < nameList.size(); index++){
                        System.out.println(nameList.get(index));
                    }
                    break;
                case 3:
                    break loop;
            }
        }
    }
}
