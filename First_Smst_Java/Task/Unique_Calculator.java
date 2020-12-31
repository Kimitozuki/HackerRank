package First_Smst_Java.Task;
import java.util.Scanner;
public class Unique_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInt = input.nextInt();
        String neg = numInt < 0 ? "-" : "";
        numInt = Math.abs(numInt);
        System.out.print(neg);
        String num = Integer.toString(numInt);
        for(int loop = num.length() - 1; loop >= 0; loop--){
            System.out.print(num.charAt(loop));
        }
    }
}
