package First_Smst_Java.Live_Coding.Mid_Exam;
import java.util.Scanner;
public class Days_Rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int days;
        if ((A+B) > C){
            days = (A + B + C)/2;
            System.out.println(days);
        }else if ((A+B) <= C) {
            days = A + B;
            System.out.println(days);
        }
    }
}
