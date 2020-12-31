package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Chicken_Fox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/live-coding-4-pemdas-si-a/challenges/rubah-dan-ayam
        //https://www.hackerrank.com/contests/livecode-4-tif-a/challenges/rubah-dan-ayam
        String farm = input.nextLine();
        char[] arrayFarm = farm.toCharArray();
        int index = 0, foxOut = 0, foxIn = 0, gate = 0, firstGate = 0;
        for(; index < arrayFarm.length; index++){
            if(gate == 1){
                if(foxIn == 1){
                    if(arrayFarm[index] == 'A'){
                        arrayFarm[index] = '.';
                    }else if(arrayFarm[index] == ']'){
                        gate = 0;
                        foxIn = 0;
                    }
                }else{
                    if(arrayFarm[index] == 'R'){
                        foxIn = 1;
                        index = firstGate;
                    }else if(arrayFarm[index] == ']'){
                        gate = 0;
                    }
                }
            }else if(gate == 0){
                if(foxOut == 1){
                    if(arrayFarm[index] == '['){
                        gate = 1;
                        firstGate = index;
                    }else{
                        arrayFarm[index] = arrayFarm[index] == 'A' ? '.' : arrayFarm[index];
                    }
                }else{
                    if(arrayFarm[index] == 'R'){
                        foxOut = 1;
                        index = -1;
                    }else if(arrayFarm[index] == '['){
                        gate = 1;
                        firstGate = index;
                    }
                }
            }
        }
        String out = String.valueOf(arrayFarm);
        System.out.println(out);
    }
}
