package arr;
//column wise 
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            arr[i][j]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i%2==0)
                System.out.print(arr[i][j]+" ");
                else
                System.out.print(arr[i][n-j-1]+" ");
            }
            System.out.println();
        }
    }
}
