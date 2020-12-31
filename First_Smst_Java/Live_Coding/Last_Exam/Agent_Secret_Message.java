package First_Smst_Java.Live_Coding.Last_Exam;
import java.util.ArrayList;
import java.util.Scanner;
public class Agent_Secret_Message {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String msg = input.nextLine();
        String msgCnt = "";
        Scanner removeBlank = new Scanner(msg.toLowerCase());
        while(removeBlank.hasNext()){
            msgCnt += removeBlank.next();
        }
        char[] msgArray = msgCnt.toCharArray();
        char[] msgDupe = new char[msgArray.length];
        ArrayList cleanMsg = new ArrayList();
        for(int loop = 0; loop < msgArray.length; loop++){
            boolean dupe = false;
            for(int loopCheck = 0; loopCheck < msgDupe.length; loopCheck++){
                if(msgArray[loop] == msgDupe[loopCheck]){
                    dupe = true;
                    break;
                }
            }
            if(dupe == false){
                msgDupe[loop] = msgArray[loop];
                cleanMsg.add(msgDupe[loop]);
            }
        }
        char[] msgCode = new char[cleanMsg.size()];
        for(int loop = 0; loop < msgCode.length; loop++){
            msgCode[loop] = (char)cleanMsg.get(loop);
        }
        Scanner getWord = new Scanner(msg.toLowerCase());
        while(getWord.hasNext()){
            String word = getWord.next();
            char[] wordArray = word.toCharArray();
            for(int loop = 0; loop < wordArray.length; loop++){
                for(int search = 0; search < msgCode.length; search++){
                    if(wordArray[loop] == msgCode[search]){
                        System.out.print(search + " ");
                        break;
                    }
                }
            }
            System.out.print(" ");
        }
    }
}
