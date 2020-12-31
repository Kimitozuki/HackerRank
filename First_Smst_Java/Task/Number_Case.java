package First_Smst_Java.Task;

import java.util.Scanner;
public class Number_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/latihan-seleksi-kondisi-1604663052/challenges/kasus-angka
        int numIn;

        numIn = input.nextInt();

        String numCheck = Integer.toString(numIn);
        switch (numCheck.length()){
            case 1:
                System.out.println("satuan");
                break;
            case 2:
                System.out.println("puluhan");
                break;
            case 3:
                System.out.println("ratusan");
                break;
            case 4:
                System.out.println("ribuan");
                break;
            case 5:
                System.out.println("puluhribuan");
                break;
            case 6:
                System.out.println("ratusribuan");
                break;
            default:
                System.out.println("takhingga");
                break;
        }
    }
}
