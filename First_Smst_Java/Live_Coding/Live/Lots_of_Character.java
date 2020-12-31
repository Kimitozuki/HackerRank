package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Lots_of_Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/live-coding-array-1607079840/challenges/banyak-karakter
        String sentence = input.nextLine();
        char target = input.next().charAt(0);
        char[] charSentence = sentence.toCharArray();
        int count = 0;
        for(int loop = 0; loop < charSentence.length; loop++){
            count = charSentence[loop] == target ? count += 1 : count;
        }
        System.out.println(count);
    }
}
