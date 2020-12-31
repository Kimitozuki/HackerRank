package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Ravine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height = input.nextInt();
        int side = 0;
        int blank = height * 2 - 2;
        for (int loopDown = 0; loopDown < height; loopDown++){
            side ++;
            for (int loopRight = 0; loopRight < side; loopRight++){
                System.out.print("*");
            }
            for (int loopBlank = 0; loopBlank < blank; loopBlank++){
                System.out.print(" ");
            }
            blank -= 2;
            for (int loopRight = 0; loopRight < side; loopRight++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
