package First_Smst_Java.Live_Coding.Last_Exam;
import java.util.Scanner;
//https://www.hackerrank.com/contests/uap-tif-f-2020/challenges/seleksi-tim-pkm/problem
public class PKM_Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int pick = input.nextInt();
        String[] name = new String[num];
        int[][] scoreArray = new int[num][3];
        for(int loop = 0; loop < num; loop++){
            name[loop] = input.next();
            for(int secLoop = 0; secLoop < 3; secLoop++) {
                scoreArray[loop][secLoop] = input.nextInt();
            }
        }
        int index = 2;
        int tempInt0, tempInt1, tempInt2;
        String temptStr;
        for(int loop = 0; loop < scoreArray.length; loop++){
            for(int secloop = loop + 1; secloop < scoreArray.length; secloop++){
                if(scoreArray[loop][index] == scoreArray[secloop][index]){
                    index--;
                    secloop--;
                }else if(scoreArray[loop][index] < scoreArray[secloop][index]){
                    tempInt0 = scoreArray[loop][0];
                    tempInt1 = scoreArray[loop][1];
                    tempInt2 = scoreArray[loop][2];
                    temptStr = name[loop];
                    scoreArray[loop][0] = scoreArray[secloop][0];
                    scoreArray[loop][1] = scoreArray[secloop][1];
                    scoreArray[loop][2] = scoreArray[secloop][2];
                    name[loop] = name[secloop];
                    scoreArray[secloop][0] = tempInt0;
                    scoreArray[secloop][1] = tempInt1;
                    scoreArray[secloop][2] = tempInt2;
                    name[secloop] = temptStr;
                    index = 2;
                }
            }
        }
        for(int loop = 0; loop < pick; loop++){
            System.out.println(name[loop]);
        }
    }
}
