package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class OS_Language {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/live-coding-4-pemdas-si-a/challenges/ocehan-admin-ig
        String Line = input.nextLine();
        Scanner wordFilter = new Scanner(Line);
        String word, out;
        int index;
        while(wordFilter.hasNext()){
            word = wordFilter.next();
            char[] wordArray = word.toCharArray();
            char[] reverseArray = new char[wordArray.length];
            index = wordArray.length - 1;
            for(int loop = 0; loop < wordArray.length; loop++){
                reverseArray[loop] = wordArray[index];
                index--;
            }
            out = String.valueOf(reverseArray);
            System.out.print(out + ChangeOSLanguage("os"));
        }
    }
    private static String ChangeOSLanguage(String text){
        String change = text + " ";
        return change;
    }
}
