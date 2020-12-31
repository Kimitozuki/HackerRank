package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Matrix_Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //https://www.hackerrank.com/contests/livecode-4-tif-a/challenges
        int rowSize = input.nextInt();
        int columnSize = input.nextByte();
        int[][] matrixA = new int[rowSize][columnSize];
        int[][] matrixB = new int[rowSize][columnSize];

        for(int rowLoop = 0; rowLoop < matrixA.length; rowLoop++){
            for(int columnLoop = 0; columnLoop < matrixA[rowLoop].length; columnLoop++){
                matrixA[rowLoop][columnLoop] = input.nextInt();
            }
        }
        for(int rowLoop = 0; rowLoop < matrixB.length; rowLoop++){
            for(int columnLoop = 0; columnLoop < matrixB[rowLoop].length; columnLoop++){
                matrixB[rowLoop][columnLoop] = input.nextInt();
            }
        }
        for(int rowLoop = 0; rowLoop < matrixA.length; rowLoop++){
            for(int columnLoop = 0; columnLoop < matrixA[rowLoop].length; columnLoop++){
                matrixA[rowLoop][columnLoop] += matrixB[rowLoop][columnLoop];
            }
        }
        System.out.println("Penjumlahan matrix");
        for(int rowLoop = 0; rowLoop < matrixA.length; rowLoop++){
            for(int columnLoop = 0; columnLoop < matrixA[rowLoop].length; columnLoop++){
                System.out.print(matrixA[rowLoop][columnLoop] + " ");
            }
            System.out.print("\n");
        }
    }
}
