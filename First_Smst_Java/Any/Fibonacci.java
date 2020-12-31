package First_Smst_Java.Any;
import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int Fn, F_Baru = 0;
	    int F_2 = 0, F_1 = 1;

        System.out.print("Fibonacci ke -> ");
        Fn = input.nextInt();

        switch (Fn){
            case 0:
                System.out.printf("Fibonacci ke %d adalah 0 \n",Fn);
                break;
            case 1:
                System.out.printf("Fibonacci ke %d adalah 1 \n",Fn);
                break;
            default:
                int loop_limit = Fn - 1;
                for(int loop = 0; loop < loop_limit; loop++){
                    F_Baru = F_2 + F_1;
                    F_2 = F_1;
                    F_1 = F_Baru;
                }
                System.out.printf("Fibonacci ke %d adalah %d \n",Fn,F_Baru);
        }
    }
}
