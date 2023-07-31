package arr;

import java.util.Scanner;

public class containszero {
    public static void main(String[] args) {
        Scanner ob=new Scanner( System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int a=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=i+2;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                    System.out.println(i+" "+j+" "+k);
                    return;
                    }
            
                }
            }
        }
        // if(a==1)
        // System.out.println("1");
        // else
        // System.out.println("0");
    }
}
