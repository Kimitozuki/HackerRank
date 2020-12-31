package First_Smst_Java.Task;
import java.util.Scanner;
public class Search_Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/tugas-5-pemdas-si-a/challenges/cari-bilangan-prima
        int start = input.nextInt();
        int end = input.nextInt();
        SearchPrime(start,end);
    }
    private static void SearchPrime(int start, int end){
        int zero;
        for(int loop = start; loop <= end; loop++){
            zero = 0;
            for(int modLoop = 1; modLoop < loop; modLoop++){
                zero = loop % modLoop == 0 ? zero += 1 : zero;
            }
            if(zero == 1) {
                System.out.print(loop + " ");
            }
        }
    }
}
