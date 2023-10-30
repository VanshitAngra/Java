package arr;

import java.util.Scanner;

//
public class gridways {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int m=ob.nextInt();
        int n=ob.nextInt();
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        dp[i][0]=1;
        for(int j=0;j<n;j++)
        dp[0][j]=1;
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
