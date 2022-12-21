import java.util.Scanner;

public class V_PUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int x=y*4;
        for (int i=0;i<y;i++){
            for (int j=1;j<=x;j++){
                if (j%4==0){
                    System.out.println("PUM");
                }else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
            break;

        }
    }
}