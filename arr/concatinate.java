package arr;

import java.util.Scanner;

public class concatinate {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        // myself
        int ans[]=new int[2*n];

        // for(int i=0;i<2*n;i++)
        // {
        //     if(i<n)
        //     ans[i]=nums[i];
        //     else
        //     ans[i]=nums[i-n];
        // }
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=a[i%n];
        }
        for(int i=0;i<ans.length;i++)
        System.out.println(ans[i]);

        
    }
}
