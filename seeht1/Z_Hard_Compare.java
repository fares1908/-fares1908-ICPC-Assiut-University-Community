import java.util.Scanner;

public class Z_Hard_Compare {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();

        double x= b* Math.log(a);
        double y= d*Math.log(c);

      if(x>y){
          System.out.println("YES");
      }else {
          System.out.println("NO");
      }
    }
}
