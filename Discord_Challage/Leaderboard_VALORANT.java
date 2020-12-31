package Discord_Challage;
import java.util.Arrays;
import java.util.Scanner;
public class Leaderboard_VALORANT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/utp-discord-filkom-ii/challenges
        int numTeam1 = input.nextInt();
        int numTeam2 = input.nextInt();
        int[] arrayTeam1 = new int[numTeam1];
        int[] arrayTeam2 = new int[numTeam2];
        for (int loop = 0; loop < numTeam1; loop++){
            arrayTeam1[loop] = input.nextInt();
        }
        for (int loop = 0; loop < numTeam2; loop++){
            arrayTeam2[loop] = input.nextInt();
        }
        int[] arrayCombi = new int[numTeam1 + numTeam2];
        int index = 0;
        for(int loop = 0; loop < numTeam1; loop++){
            arrayCombi[index] = arrayTeam1[loop];
            index++;
        }
        for(int loop = 0; loop < numTeam2; loop++){
            arrayCombi[index] = arrayTeam2[loop];
            index++;
        }
        Arrays.sort(arrayCombi);
        int[] arrayReverse = new int[numTeam1 + numTeam2];
        index = numTeam1 + numTeam2 - 1;
        for(int loop = 0; loop < (numTeam1 + numTeam2); loop++){
            arrayReverse[loop] = arrayCombi[index];
            index--;
        }
        System.out.println("Team || Score");
        System.out.println("=============");
        int team = 0;
        Arrays.sort(arrayTeam1);
        Arrays.sort(arrayTeam2);
        for(int cont : arrayReverse){
            if(0 <= Arrays.binarySearch(arrayTeam1,cont) && (numTeam1 - 1) >= Arrays.binarySearch(arrayTeam1,cont)){
                team = 1;
            }else if(0 <= Arrays.binarySearch(arrayTeam2,cont) && (numTeam2 - 1) >= Arrays.binarySearch(arrayTeam2,cont)){
                team = 2;
            }
            System.out.printf("%-5d|| %d \n",team,cont);
        }
    }
}
