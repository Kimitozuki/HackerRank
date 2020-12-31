package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Reverse_Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/live-coding-array-1607079840/challenges/balik-daftar
        String[] wordArray = new String[input.nextInt()];
        for(int loop = 0; loop < wordArray.length; loop++){
            wordArray[loop] = input.next();
        }
        for(int loop = wordArray.length - 1; loop >= 0; loop--){
            System.out.print(wordArray[loop] + " ");
        }
    }
}
