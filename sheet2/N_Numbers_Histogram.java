import java.util.Scanner;

public class N_Numbers_Histogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String x= in.next();

        int y = in.nextInt();//عدد السطور
        for (int i=0;i<y;i++){
            int loop= in.nextInt();//عدد تكرارات العلامه
            for (int j=0;j<loop;j++){
                System.out.print(x);

            }
            System.out.println();

        }
    }
}