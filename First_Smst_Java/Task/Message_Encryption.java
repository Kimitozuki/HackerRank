package First_Smst_Java.Task;
import java.util.Scanner;
public class Message_Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/tugas-4-tif-a/challenges
        String Line = input.nextLine();
        Scanner wordFilter = new Scanner(Line);
        String word;
        char secondChar = ' ';
        int ascii = 0;
        while(wordFilter.hasNext()){
            word = wordFilter.next();
            char[] wordArray = word.toCharArray();
            for(int loop = 0; loop < wordArray.length; loop++){
                if(loop == 0){
                    ascii = wordArray[loop];
                }else if(loop == 1){
                    secondChar = wordArray[loop];
                }else if(loop == wordArray.length - 1){
                    wordArray[1] = wordArray[loop];
                    wordArray[loop] = secondChar;
                }
            }
            System.out.print(ascii);
            for(int loop = 1; loop < wordArray.length; loop++){
                System.out.print(wordArray[loop]);
            }
            System.out.print(" ");
        }
    }
}
