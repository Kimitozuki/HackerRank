package First_Smst_Java.Live_Coding.Mid_Exam;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int days;
        if ((A+B) > C){
            double min = Math.ceil(Math.abs((C - (A+B)))/2.0);
            days = (int)(A + B - min);
            System.out.println(days);
        }else if ((A+B) <= C) {
            days = A + B;
            System.out.println(days);
        }
    }
}
