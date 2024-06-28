package sixthsem;

import java.util.Scanner;

public class q1 {
    public static int knapsack(int[][] arr, int i, int cap,int max) {
        // int N = weights.length;
        // int[][] dp = new int[N + 1][W + 1];

        // // Build the dp array
        // for (int i = 1; i <= N; i++) {
        //     for (int w = 0; w <= W; w++) {
        //         if (weights[i - 1] <= w) {
        //             dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + profits[i - 1]);
        //         } else {
        //             dp[i][w] = dp[i - 1][w];
        //         }
        //     }
        // }
        if(i==arr.length)
        return 0;
        int include=0;
        if(cap+arr[i][0]<=max)
        {
            include=arr[i][1]+knapsack(arr, i+1, cap+arr[i][0], max);
        }
        int exclude=knapsack(arr, i+1, cap, max);
        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=2;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=ob.nextInt();
            }
        }
        int maxw=ob.nextInt();
       int a= knapsack(arr,0,0,maxw);
       System.out.println(a);
    }
}
