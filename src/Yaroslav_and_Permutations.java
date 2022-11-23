import java.util.Scanner;

public class Yaroslav_and_Permutations {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = in.nextInt();
        }
        int result=0;
        for(int i=0;i<n;i++){ //عشان يعدي واحده واحده علي عناصر الاريي ويشوف اي اكتر عنصر متكرر
            int p=0;
            for (int z=0 ; z<n; z++){
                if (arr[i] == arr[z]){
                    p++;
                }
                if(p> result){
                    result=p;

                }
            }
        }
        if(n%2==0){
            if(result <=n/2){
                System.out.println("YES");

            }
            else {
                System.out.println("NO");
            }
        }
        else {
            if(result <=(n/2)+1){
                System.out.println("YES");

            }
            else {
                System.out.println("NO");
            }
        }

        }
    }

