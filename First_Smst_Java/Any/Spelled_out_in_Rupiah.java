package First_Smst_Java.Any;
import java.util.Scanner;

public class Spelled_out_in_Rupiah{
    //https://www.hackerrank.com/contests/latihan-bleh/challenges/terbilang-rupiah
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayIn = input.next().split("\\.");
        String spelled = "";
        String[] singleDigit = {"","satu ","dua ","tiga ","empat ","lima ","enam ","tujuh ","delapan ","sembilan "};
        String[] doubleDigit = {"sepuluh ","sebelas ","dua belas ","tiga belas ","empat belas ","lima belas ","enam belas ","tujuh belas ","delapan belas ","sembilan belas "};
        String[] lastSpell = {"", "", "ribu ", "juta ", "miliar "};
        boolean nextDigit = false;
        int index = 0, charIndex = 0;
        for(int loop = arrayIn.length; loop > 0; loop--){
            for(int secLoop = arrayIn[index].length(); secLoop > 0; secLoop--){
                switch(secLoop){
                    case 3:
                        if(arrayIn[index].charAt(charIndex) == '1'){
                            spelled += "seratus ";
                        }else{
                            spelled += singleDigit[Character.getNumericValue(arrayIn[index].charAt(charIndex))];
                            spelled += arrayIn[index].charAt(charIndex) != '0' ? "ratus " :"";
                        }
                        break;
                    case 2:
                        if(arrayIn[index].charAt(charIndex) == '1'){
                            nextDigit = true;
                        }else{
                            spelled += singleDigit[Character.getNumericValue(arrayIn[index].charAt(charIndex))];
                            spelled += arrayIn[index].charAt(charIndex) != '0' ? "puluh " :"";
                        }
                        break;
                    case 1:
                        if(nextDigit == true){
                            spelled += doubleDigit[Character.getNumericValue(arrayIn[index].charAt(charIndex))];
                            spelled += lastSpell[loop];
                            nextDigit = false;
                        }else{
                            spelled += singleDigit[Character.getNumericValue(arrayIn[index].charAt(charIndex))];
                            spelled += lastSpell[loop];
                        }
                        break;
                }
                charIndex++;
            }
            index++;
            charIndex = 0;
        }
        System.out.println(spelled + "rupiah ");
    }
}