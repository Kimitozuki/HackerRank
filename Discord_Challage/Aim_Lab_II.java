package Discord_Challage;
import java.util.Scanner;
import java.util.Arrays;
public class Aim_Lab_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/utp-discord-filkom-ii/challenges
        int participants = input.nextInt();
        int[] arrayScore = new int[participants];
        for(int loop = 0; loop < participants; loop++){
            arrayScore[loop] = input.nextInt();
        }
        Arrays.sort(arrayScore);
        int reverseIndex = participants - 1;
        int[] arrayReverse = new int[participants];
        for(int loop = 0; loop < participants; loop++){
            arrayReverse[loop] = arrayScore[reverseIndex];
            reverseIndex--;
        }
        String preOut1 = Arrays.toString(arrayReverse).replace("[","");
        String preOut2 = preOut1.replace("]","");
        String finalOut = preOut2.replaceAll(", "," > ");
        System.out.println(finalOut);
    }
}
