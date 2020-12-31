package First_Smst_Java.Task;
import java.util.Scanner;
public class Flower_Bouquet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/tugas-5-tif-a/challenges
        String colors = input.nextLine();
        int num = colors.length();
        int comb = num >= 3 ? (factorial(num) / (factorial(3) * factorial(num - 3))) : 0;
        System.out.println("Jumlah kemungkinannya yaitu : " + comb);
    }
    public static int factorial(int factorialIn){
        if(factorialIn == 1 || factorialIn == 0){
            return 1;
        }else{
            return factorialIn * factorial(factorialIn - 1);
        }
    }
}