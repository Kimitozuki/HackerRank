package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Personal_Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/live-coding-array-1607079840/challenges/data-diri
        int size = input.nextInt();
        String[] name = new String[size];
        int[] age = new int[size];
        for(int loop = 0; loop < size; loop++){
            name[loop] = input.next();
            age[loop] = input.nextInt();
        }
        int req = input.nextInt() - 1;
        System.out.println("Nama : " + name[req]);
        System.out.println("Umur : " + age[req]);
    }
}
