//import java.util.Scanner;
//
//public class G_Factorial {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        long fact=1;
//        long x = in.nextLong();
//     for (long i =1;i<=x;i++){
//            long y = in.nextLong();
//            for (long j =1 ;j<=y;j++){
//                fact*=j;
//
//            }
//            System.out.println(fact);
//            fact=1;
//
//
//        }
//
//
//       }
//}

//حل اخر
import java.util.Scanner;

public class G_Factorial {

public static void  fact(Long x){
    long facto=1;
    for ( long i =1 ;i<=x;i++) {
        facto *= i;
    }
        System.out.println(facto);

}
       public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           long x = in.nextLong();
           Long[] arr = new Long[(int) x];
           for (int i = 0; i < arr.length; i++) {
               arr[i] = in.nextLong();
           }
           for (int i = 0; i < arr.length; i++) {
               fact(arr[i]);


           }
       }
}


