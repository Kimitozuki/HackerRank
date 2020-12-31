package First_Smst_Java.Task;
import java.util.Arrays;
import java.util.Scanner;
public class Cinema_Chairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/tugas-4-tif-a/challenges
        int tickets = Integer.parseInt(input.nextLine());
        String seatCode = input.nextLine();
        String code;
        Scanner codeFilter = new Scanner(seatCode);
        boolean[][] seat = new boolean [5][5];
        int row, column;
        char[] rowArrays = {'A','B','C','D','E'};
        for(int loop = 0; loop < tickets; loop++){
            code = codeFilter.next();
            char[] codeArray = code.toCharArray();
            row = Arrays.binarySearch(rowArrays,codeArray[0]);
            column = Character.getNumericValue(codeArray[1]) - 1;
            seat[row][column] = true;
        }
        char alphabet = 65;
        System.out.println("  1 2 3 4 5");
        for(int rowLoop = 0; rowLoop < seat.length; rowLoop++){
            System.out.print(alphabet + " ");
            for(int columnLoop = 0; columnLoop < seat[rowLoop].length; columnLoop++){
                if(seat[rowLoop][columnLoop] == true){
                    System.out.print("x ");
                }else if(seat[rowLoop][columnLoop] == false){
                    System.out.print("o ");
                }
            }
            System.out.print("\n");
            alphabet++;
        }
        System.out.println("  L-A-Y-A-R");
    }
}
