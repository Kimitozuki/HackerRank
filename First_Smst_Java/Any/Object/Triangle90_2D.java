package First_Smst_Java.Any.Object;
import java.util.Scanner;
public class Triangle90_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height = input.nextInt();
        int toRight = 0;
        for (int loopDown = 0; loopDown < height; loopDown++){
            toRight++;
            for (int loopRight = 0; loopRight < toRight; loopRight++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
