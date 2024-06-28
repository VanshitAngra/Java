package dp;

import java.util.Arrays;
import java.util.Scanner;

public class coins {
    public static int countOfCoins(int n,int[] a,int[] dp)
    {
        if(n==0)
        return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(n-a[i]>=0)
            {
                int sub=0;
                if(dp[n-a[i]]!=-1)
                sub=dp[n-a[i]];
                else
                {
                    sub=countOfCoins(n-a[i], a,dp);
                }
                if(sub!=Integer.MAX_VALUE&&sub+1<=ans)
                {
                    ans=sub+1;
                }
            }
        }
        dp[n]=ans;//to store the ans in the array
        return ans;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int s=ob.nextInt();
        int[] a=new int[s];
        int[] dp=new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]=0;//so that it should not revolve in this array again and again
        for(int i=0;i<s;i++)
        {
            a[i]=ob.nextInt();
        }
        int res=countOfCoins(n,a,dp);
        System.out.println(res);
    }
}
