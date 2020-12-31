package Discord_Challage;
import java.util.Scanner;
public class Aim_Lab_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/utp-discord-filkom-ub/challenges
        int match = input.nextInt();
        int indexHuda = 0, indexForga = match;
        int hudaScore, forgaScore, huda = 0, forga = 0;
        int[] arrayAllScore = new int[match*2];
        for(int loop = 0; loop < match*2; loop++){
            arrayAllScore[loop] = input.nextInt();
        }
        for(int loop = 0; loop < match; loop++){
            hudaScore = arrayAllScore[indexHuda];
            indexHuda++;
            forgaScore = arrayAllScore[indexForga];
            indexForga++;
            if (hudaScore > forgaScore){
                huda++;
            }else if (hudaScore < forgaScore){
                forga++;
            }else if (hudaScore == forgaScore){
                continue;
            }
        }
        System.out.printf("Huda : %d - %d : Forga",huda,forga);
    }
}
