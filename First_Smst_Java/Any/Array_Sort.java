package First_Smst_Java.Any;
import java.util.Arrays;
public class Array_Sort {
    public static void main(String[] args) {
        int[] num = {87,65,73};
        int temp;
        for(int loop = 0; loop < num.length; loop++){
            for(int secloop = loop + 1; secloop < num.length; secloop++){
                if(num[loop] > num[secloop]){
                    temp = num[loop];
                    num[loop] = num[secloop];
                    num[secloop] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
