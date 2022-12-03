import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class _Age_in_Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int year=365;
        int month=30;
        int AgeOfYear,AgeOfMonth,AgeOfDays;
        AgeOfYear=x/year;
        x%=year;
        AgeOfMonth=x/month;
        AgeOfDays=x%month;
        System.out.println(AgeOfYear+" years");
        System.out.println(AgeOfMonth+" months");
        System.out.println(AgeOfDays+" days");

    }
}