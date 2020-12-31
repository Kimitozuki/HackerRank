package First_Smst_Java.Any.Object;
import java.util.Scanner;
public class Triangle_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height = input.nextInt();
        int top = (height % 2) == 0 ? 2 : 1;
        int blank = height - 1;
        for (int loopDown = 0; loopDown < height; loopDown++){
            for (int loopBlank = 0 ; loopBlank < blank; loopBlank++){
                System.out.print("  ");
            }
            for (int loopTop = 0; loopTop < top; loopTop++){
                System.out.print("* ");
            }
            System.out.print("\n");
            blank--;
            top += 2;
        }
    }
}
