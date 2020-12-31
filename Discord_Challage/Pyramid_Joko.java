package Discord_Challage;
import java.util.Scanner;
public class Pyramid_Joko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/utp-discord-filkom-ii/challenges
        int height = input.nextInt();
        int leftLimit = 0, rightLimit = 0, left = 1;
        int blank = height - 1;
        for (int loopDown = 0; loopDown < height; loopDown++){
            for (int loopBlank = 0 ; loopBlank < blank; loopBlank++){
                System.out.print("  ");
            }
            for (int loopLeft = 0; loopLeft < leftLimit; loopLeft++){
                System.out.print(left + " ");
                left = left - 1;
            }
            System.out.print("1 ");
            int right = 1;
            for (int loopRight = 0; loopRight < rightLimit; loopRight++){
                right = right + 1;
                System.out.print(right + " ");
            }
            System.out.print("\n");
            leftLimit++;
            rightLimit++;
            left = right + 1;
            blank--;
        }
    }
}
