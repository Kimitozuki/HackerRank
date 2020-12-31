package First_Smst_Java.Live_Coding.Last_Exam;
import java.lang.StringBuilder;
import java.util.Scanner;
public class Name_of_Benben {
    //https://www.hackerrank.com/contests/uap-pemrograman-dasar-tif-c/challenges/benben-mendapat-nama
    //https://www.hackerrank.com/contests/uap-tif-d/challenges/benben-mendapat-nama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder fullWord = new StringBuilder(input.next());
        int ans = 0;
        for(int loop = 0; loop < fullWord.length() - 2; loop++){
            if(fullWord.charAt(loop) == 'b'){
                loop++;
                target: for(int secLoop = loop; secLoop < fullWord.length() - 1; secLoop++){
                    if(fullWord.charAt(loop) == 'e'){
                        loop++;
                        for(int trdLoop = loop; trdLoop < fullWord.length(); trdLoop++){
                            if(fullWord.charAt(loop) == 'n'){
                                ans++;
                                break target;
                            }else{
                                fullWord.delete(loop,loop + 1);
                            }
                        }
                    }else{
                        fullWord.delete(loop,loop + 1);
                    }
                }
            }
        }
        System.out.println(ans/2);
    }
}
