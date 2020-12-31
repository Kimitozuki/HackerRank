package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Sort_Word {
    static void sortName(String [] arr){
        String temp;
        for(int loop = 0; loop < arr.length; loop++){
            for(int secloop = loop + 1; secloop < arr.length; secloop++){
                if(arr[loop].compareTo(arr[secloop]) > 0){
                    temp = arr[loop];
                    arr[loop] = arr[secloop];
                    arr[secloop] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String initialName = in.nextLine();
        String[] stringarr = initialName.split(" ");
        sortName(stringarr);
        for(String a : stringarr){
            System.out.print(a + " ");
        }
    }
}