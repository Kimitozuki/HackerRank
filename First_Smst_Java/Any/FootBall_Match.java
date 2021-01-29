package First_Smst_Java.Any;
import java.util.Scanner;
public class FootBall_Match {
    //https://www.hackerrank.com/contests/latihan-bleh/challenges/liverpool-vs-manchester-united
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double voorLp = input.nextDouble();
        double voorMU = input.nextDouble();
        String teamBet = input.next();
        int bet = input.nextInt();
        double scoreLp = input.nextDouble();
        double scoreMU = input.nextDouble();
        double multiplier = 0;
        int ans = 0;
        
        scoreLp += voorLp;
        scoreMU += voorMU;
        switch(teamBet){
            case "Liverpool":
                multiplier = (scoreLp - scoreMU) * 2; break;
            case "MU":
                multiplier = (scoreMU - scoreLp) * 2; break;
        }
        ans = bet + (int)(bet * multiplier);
        ans = ans <= 0 ? 0 : ans;
        System.out.println(ans);
    }
}
