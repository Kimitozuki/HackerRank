package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Task_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tugas = in.nextLine();
        String[] tugasArray = tugas.split(" ");
        removeDuplicates(tugasArray);
    }
    static void removeDuplicates(String[] arr){
        String[] dupeArrays = new String[arr.length];
        for(int loop = 0; loop < arr.length; loop++){
            boolean dupe = false;
            for(int loopCheck = 0; loopCheck < dupeArrays.length; loopCheck++){
                if(arr[loop].equals(dupeArrays[loopCheck])){
                    dupe = true;
                    break;
                }
            }
            if(dupe == false){
                dupeArrays[loop] = arr[loop];
            }
        }
        for(int loop = 0; loop < dupeArrays.length; loop++){
            if(dupeArrays[loop] == null){
                continue;
            }
            System.out.print(dupeArrays[loop] + " ");
        }
    }
}