package First_Smst_Java.Live_Coding.Last_Exam;
import java.util.Scanner;
public class Space_Rev {
    //https://www.hackerrank.com/contests/uap-tif-a-2020/challenges/apa-itu-spasi
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.next();
        String word = "";
        int acara = 0, ddm = 0, kestari = 0, humas = 0, admin = 0, pit = 0;
        for(int index = 0; index < sentence.length(); index++){
            word += sentence.charAt(index);
            switch (word){
                case "acara":
                    acara++;
                    word = "";
                    break;
                case "ddm":
                    ddm++;
                    word = "";
                    break;
                case "kestari":
                    kestari++;
                    word = "";
                    break;
                case "humas":
                    humas++;
                    word = "";
                    break;
                case "admin":
                    admin++;
                    word = "";
                    break;
                case "pit":
                    pit++;
                    word = "";
                    break;
                default:
                    continue;
            }
        }
        for(int loop = 0; loop < acara; loop++){
            System.out.print("Acara ");
        }
        for(int loop = 0; loop < ddm; loop++){
            System.out.print("DDM ");
        }
        for(int loop = 0; loop < kestari; loop++){
            System.out.print("Kestari ");
        }
        for(int loop = 0; loop < humas; loop++){
            System.out.print("Humas ");
        }
        for(int loop = 0; loop < admin; loop++){
            System.out.print("Admin ");
        }
        for(int loop = 0; loop < pit; loop++){
            System.out.print("PIT ");
        }
    }
}
