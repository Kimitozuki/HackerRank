package First_Smst_Java.Any;
import  java.util.Scanner;
public class Couple_Compatibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cantik, pintar, hemat;

        cantik = input.nextBoolean();
        pintar = input.nextBoolean();
        hemat = input.nextBoolean();

        if (cantik == (true)){
            if (pintar == (true)){
                if (hemat == (true)){
                    System.out.println("Cocok");
                }else if (hemat == (false)){
                    System.out.println("Kurang Cocok");
                }
            }else if (pintar == (false)){
                if (hemat == true){
                    System.out.println("Kurang Cocok");
                }else if (hemat == (false)) {
                    System.out.println("Tidak Cocok");
                }
            }
        }else if (cantik == (false)) {
            if (pintar == (true)) {
                if (hemat == (true)) {
                    System.out.println("Kurang Cocok");
                } else if (hemat == (false)) {
                    System.out.println("Tidak Cocok");
                }
            } else if (pintar == (false)) {
                if (hemat == true) {
                    System.out.println("Tidak Cocok");
                } else if (hemat == false) {
                    System.out.println("Skip");
                }
            }
        }
        input.close();
    }
}
