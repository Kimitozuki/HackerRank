package First_Smst_Java.Any.Object;
import java.util.Scanner;
public class FilledSquare_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        for (int loopDown = 0; loopDown < length; loopDown++){
            for (int loopRight = 0; loopRight < length; loopRight++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
