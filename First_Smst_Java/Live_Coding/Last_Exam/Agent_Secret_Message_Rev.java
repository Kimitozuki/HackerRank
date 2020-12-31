package First_Smst_Java.Live_Coding.Last_Exam;
import java.util.Scanner;
import java.util.ArrayList;
public class Agent_Secret_Message_Rev {
    //https://www.hackerrank.com/contests/uap-tif-a-2020/challenges/pesan-rahasia-agen
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String msg = input.nextLine().toLowerCase();
        String concatMsg = msg.replaceAll(" ", "");
        //Remove Double Char
        char[] concatMsgArray = concatMsg.toCharArray();
        ArrayList<Character> numChar = new ArrayList<Character>();
        for(int indexChar = 0; indexChar < concatMsgArray.length; indexChar++){
            for(int indexCheck = 0; indexCheck <= indexChar; indexCheck++){
                if(indexCheck == indexChar){
                    numChar.add(concatMsgArray[indexChar]);
                }else if(concatMsgArray[indexCheck] == concatMsgArray[indexChar]){
                    break;
                }
            }
        }
        //Output
        Scanner scWord = new Scanner(msg);
        while(scWord.hasNext()){
            String word = scWord.next();
            for(int loop = 0; loop < word.length(); loop++){
                for(int index = 0; index < numChar.size(); index++){
                    if(word.charAt(loop) == numChar.get(index)){
                        System.out.print(index + " ");
                        break;
                    }
                }
            }
            System.out.print(" ");
        }
    }
}
