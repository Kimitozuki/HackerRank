package First_Smst_Java.Live_Coding.Last_Exam;
import java.util.Scanner;
public class PT_KAI_Internship {
    //https://www.hackerrank.com/contests/uap-pemrograman-dasar-tif-c/challenges/magang-pt-kai
    //https://www.hackerrank.com/contests/uap-tif-d/challenges/magang-pt-kai
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCarriage = input.nextInt();
        if(numCarriage == 0){
            System.out.println("Kereta tidak bisa dibuat jika tidak ada lokomotif");
            return;
        }
        String comm = input.next();
        switch(comm){
            case "rotate":
                System.out.print("1 ");
                for(int loop = numCarriage; loop > 1; loop--){
                    System.out.print(loop + " ");
                }
                break;
            case "detach":
                int carriage = input.nextInt();
                if(carriage > numCarriage){
                    System.out.println("Gerbong kereta tidak ada");
                    for(int loop = 1; loop <= numCarriage; loop++){
                        System.out.print(loop + " ");
                    }
                }else{
                    if(carriage == 1){
                        System.out.println("Lokomotif tidak bisa dilepas");
                    }else{
                        for(int loop = 1; loop < carriage; loop++){
                            System.out.print(loop + " ");
                        }
                    }
                }
                break;
        }
    }
}
