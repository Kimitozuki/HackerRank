package First_Smst_Java.Live_Coding.Live;
import java.util.Scanner;
public class Task_List_Rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tugas = in.nextLine();
        String[] tugasArray = tugas.split(" ");
        removeDuplicates(tugasArray);
    }
    static void removeDuplicates(String[] arr){
        String sentance = "";
        for(String word : arr){
            sentance += sentance.contains(word) ? "" : word + " ";
        }
        System.out.println(sentance);
    }
}