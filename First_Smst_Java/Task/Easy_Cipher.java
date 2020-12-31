package First_Smst_Java.Task;
import java.util.Scanner;
public class Easy_Cipher {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char huruf1,huruf2;
        int geser,ascii1,ascii2,hasil1,hasil2;
        String str1,str2,gabungan;

        geser = input.nextInt();
        huruf1 = input.next().charAt(0);
        huruf2 = input.next().charAt(0);

        ascii1 = huruf1;
        ascii2 = huruf2;
        hasil1 = ascii1 + geser;
        hasil2 = ascii2 + geser;
        huruf1 = (char) hasil1;
        huruf2 = (char) hasil2;
        str1 = Character.toString(huruf1);
        str2 = Character.toString(huruf2);
        gabungan = str1.concat(" " + str2);

        Scanner output = new Scanner (gabungan);
        output.useDelimiter(" ");
        while (output.hasNext()) {
            String temp = output.next();
            System.out.println(temp);
        }
    }
}
