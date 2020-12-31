package First_Smst_Java.Live_Coding.Mid_Exam;
import java.util.Scanner;
public class Hate_Mondays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String date1 = input.next();
        String month1 = input.next();
        String year1 = input.next();
        String date2 = input.next();
        String month2 = input.next();
        String year2 = input.next();

        int dateB = Integer.parseInt(date1);
        int monthB = Integer.parseInt(month1);
        int yearB = Integer.parseInt(year1);
        int dateN = Integer.parseInt(date2);
        int monthN = Integer.parseInt(month2);
        int yearN = Integer.parseInt(year2);

        int monday;
        int range = (30-dateB) + ((12-monthB)*30) + (Math.abs((yearB+1)-yearN)*360) + ((monthN-1)*30) + dateN;

        if(range >= 6480 && range < 21600){
            monday = ((range - 6480)/7)+1;
            System.out.println(monday);
        }else if (range >= 21600){
            monday = 2160;
            System.out.println(monday);
        } else if (range < 6480){
            monday = 0;
            System.out.println(monday);
        }
    }
}