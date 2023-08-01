package arr;

import java.util.Scanner;

public class maxmin {
    public static int max(int n,int[] arr)
    {
        int m=arr[0];
        for(int i=1;i<n;i++)
        {
            if(m<arr[i])
            m=arr[i];
        }
        return m;
    }
    public static int min(int n,int[] arr)
    {
        int m=arr[0];
        for(int i=1;i<n;i++)
        {
            if(m>arr[i])
            m=arr[i];
        }
        return m;
    }
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
       int a= max(n,arr);
       int b= min(n,arr);
       System.out.println("max is ="+a);
       System.out.println("min is ="+b);
    }
}
