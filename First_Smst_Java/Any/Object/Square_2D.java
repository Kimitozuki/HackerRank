package First_Smst_Java.Any.Object;
import java.util.Scanner;
public class Square_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int midlength = length - 1;
        int blank = length - 2;
        for (int loopDown = 0; loopDown < length; loopDown++){
            if (loopDown == 0){
                for (int top = 0; top < length; top++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }else if (loopDown != 0 && loopDown != midlength){
                System.out.print("* ");
                for (int mid = 0; mid < blank; mid++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.print("\n");
            }else if (loopDown == midlength) {
                for (int bottom = 0; bottom < length; bottom++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }
    }
}
