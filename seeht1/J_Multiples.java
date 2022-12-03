import java.util.Scanner;

public class J_Multiples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        long min=Math.min(x , y);
        long max=Math.max(x , y);
        if(max%min==0){
            System.out.println("Multiples");
        }else{
            System.out.println("No Multiples");
        }
    }
}
