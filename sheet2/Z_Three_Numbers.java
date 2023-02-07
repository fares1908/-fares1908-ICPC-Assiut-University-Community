import java.util.Scanner;
//فكره المساله انه عايز 3 ارقا م جمب بعض زي  البينري بحيث يكون جمهم نفس الرقم  s ويكونوا الارقام جمعها اققل من ال k
public class Z_Three_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k= in.nextInt();
        int s= in.nextInt();
        int count=0;
        for (int i=0;i<=k;i++){
            for (int j=0;j<=k;j++){
                if (s-i-j>=0&&s-i-j<=k){
                    count++;
                }
            }
        }
        System.out.print(count);

    }

}
