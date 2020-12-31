package First_Smst_Java.Live_Coding.Last_Exam;
import java.util.Scanner;
public class Primoral {
    //https://www.hackerrank.com/contests/uap-tif-a-2020/challenges/bilangan-primorial
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextInt();
        double[] primeslist = {2,3,5,7,11,13,17,19,23,29};
        double cont = 1;
        for (int loop = 0; loop < num; loop++) {
            cont *= primeslist[loop];
        }
        System.out.printf("%.0f",cont);
    }
}
