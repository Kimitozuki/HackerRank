package First_Smst_Java.Task;
import java.util.Scanner;
public class Is_It_Primes {
    static boolean isItPrime(int number){
        int zero = 0;
        for(int modLoop = 1; modLoop < number; modLoop++){
            zero = number % modLoop == 0 ? zero += 1 : zero;
        }
        return zero == 1 ? false : true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //https://www.hackerrank.com/contests/tugas-5-tif-a/challenges
        int prime = in.nextInt();
        boolean check = isItPrime(prime);
        if(!check){
            System.out.println(prime + " merupakan bilangan prima");
        }
        else{
            System.out.println(prime + " bukan merupakan bilangan prima");
        }
    }
}