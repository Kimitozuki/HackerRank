package Discord_Challage;
import java.util.Scanner;
public class UNO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/latihan-uap-discord-filkom/challenges
        int numCard = Integer.parseInt(input.nextLine());
        int numPlayer = Integer.parseInt(input.nextLine());
        String cardType = input.nextLine();
        System.out.println(cardPrediction(numCard, numPlayer, cardType));
    }
    public static int cardPrediction(int numCard, int numPlayer, String cardType){
        boolean reverse = false;
        Scanner UNOcard = new Scanner(cardType);
        int player = 1;
        while(UNOcard.hasNext()){
            String card = UNOcard.next();
            if(card.equals("reverse")){
                reverse = reverse ? false : true;
                card = UNOcard.next();
                continue;
            }else{
                if(reverse == false){
                    player = player == numPlayer ? 1 : ++player;
                }else{
                    player = player == 1 ? numPlayer : --player;
                }
            }
        }
        return player = player == 1 ? numPlayer : --player;
    }
}
