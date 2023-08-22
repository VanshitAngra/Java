package arr;

import java.util.Scanner;

public class matrixRow {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            arr[i][j]=ob.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(j%2==0)
                System.out.print(arr[i][j]);
                else
                System.out.print(arr[n-i-1][j]);
            }
            System.out.println()    ;
        }
    }
}
