package First_Smst_Java.Any;
import java.util.Scanner;
public class Find_RunnerUp {
    //https://www.hackerrank.com/contests/latihan-bleh/challenges/tentukan-runner-up
    public static void main(String[] args) {
        //DILARANG MENGUBAH MAIN CLASS!!!
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }
      sc.close();
      
      Count RunnerUp = new Count(arr);
      
      System.out.println(RunnerUp.FindRunnerUp());    
  }
}
class Count {
    private int[] arrNum;

    Count (int[] newArrNum){
       this.arrNum = newArrNum;
    }

    public int FindRunnerUp(){
        int temp;
        for(int loop = 0; loop < arrNum.length; loop++){
            for(int secloop = loop + 1; secloop < arrNum.length; secloop++){
                if(arrNum[loop] < arrNum[secloop]){
                    temp = arrNum[loop];
                    arrNum[loop] = arrNum[secloop];
                    arrNum[secloop] = temp;
                }
            }
        }
        int ans = 0;
        for(int loop = 0; loop < arrNum.length; loop++){
            if(arrNum[loop] != arrNum[loop + 1]){
                ans = arrNum[loop + 1]; break;
            }
        }
        return ans;
    }
}