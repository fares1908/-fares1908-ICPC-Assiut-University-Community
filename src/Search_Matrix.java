import java.util.Scanner;

public class Search_Matrix {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number Of Row");
        int row= in.nextInt();
        System.out.println("Enter Number Of Column");
        int col= in.nextInt();
        int[][] arr =new int[row][col];
        for (int i =0;i<row;i++){
            System.out.println("row" +i);
            for (int x=0;x<col;x++){
                arr[i][x] = in.nextInt();
            }
        }
        System.out.println("Enter your num");
        int sc=in.nextInt();
        int g=0;
        for(int i =0;i<row;i++){
            for(int x=0 ;x<col;x++) {
                if (arr[i][x] == sc) {
                    g = 1;
                    break;
                }
            }
            if(g==1){
              break;
          }

        }
        if(g == 1){
            System.out.println("will not take number");
        } else {
            System.out.println("will take number");
        }

    }
}
