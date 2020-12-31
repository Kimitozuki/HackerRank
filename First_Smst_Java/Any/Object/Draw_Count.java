package First_Smst_Java.Any.Object;
import java.util.Scanner;
public class Draw_Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Panjang: ");
        int panjang = input.nextInt();
        System.out.print("Lebar: ");
        int lebar = input.nextInt();
        System.out.printf("\n");

        System.out.println("Image");
        image(panjang,lebar);

        System.out.println("Arround: " + around(panjang,lebar));
        System.out.println("large: " + large(panjang,lebar));
    }
    private static void image(int panjang, int lebar){
        for (int loopDown = 0; loopDown < lebar; loopDown++){
            for (int loopRight = 0; loopRight < panjang; loopRight++){
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
    private static int around(int panjang, int lebar){
        int formula = 2 * panjang + 2 * lebar;
        return formula;
    }
    private static int large(int panjang, int lebar){
        int formula = panjang * lebar;
        return formula;
    }
}
