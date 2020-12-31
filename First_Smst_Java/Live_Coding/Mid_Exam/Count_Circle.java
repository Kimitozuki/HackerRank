package First_Smst_Java.Live_Coding.Mid_Exam;
import java.util.Scanner;
public class Count_Circle {
    public static void main(String[] args) {
        //https://www.hackerrank.com/contests/utp/challenges/utp-soal-1
        /*
        Constraints
        0 < r <= 500
         */
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double rad = input.nextFloat();
        rad = rad > 0 && rad <= 500 ? rad : 0;
        System.out.printf("Hasil perhitungan %S adalah:\n",name);
        double around = 2 * rad * 3.14;
        System.out.printf("Keliling = %.2f \n", around);
        double wide = 3.14 * Math.pow(rad,2);
        System.out.printf("Luas = %.2f \n", wide);
    }
}