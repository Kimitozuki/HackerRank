package First_Smst_Java.Task;
import java.util.Scanner;
public class One_Pocker_Card {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/latihan-seleksi-kondisi-1604663052/challenges/poker-satu-kartu
        int alice_card, bob_card;

        alice_card = input.nextInt();
        bob_card = input.nextInt();

        int CheckedCard_alice = (alice_card == 1) ? alice_card + 13 : alice_card + 0;
        int CheckedCard_bob = (bob_card == 1) ? bob_card + 13 : bob_card + 0;

        if (CheckedCard_alice > CheckedCard_bob){
            System.out.println("Alice");
        }else if (CheckedCard_alice < CheckedCard_bob){
            System.out.println("Bob");
        }else if (CheckedCard_alice == CheckedCard_bob){
            System.out.println("Draw");
        }
    }
}
