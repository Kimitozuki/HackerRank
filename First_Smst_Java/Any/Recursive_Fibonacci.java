package First_Smst_Java.Any;
import java.util.Scanner;
public class Recursive_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long Fn = Math.round(input.nextDouble()) - 1;
        System.out.println(Fibonacci(Fn));
    }
    private static long Fibonacci(long Fn){
        if(Fn == 1 || Fn == 0){
            return Fn;
        }
        return (Fibonacci(Fn - 2)) + (Fibonacci(Fn - 1));
    }
}
