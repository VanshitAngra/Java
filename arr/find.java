//find the element then return its index
package arr;

import java.util.Scanner;

public class find {
    public static int fun(int n,int[]arr,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(key==arr[i])
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int key=ob.nextInt();
       int a= fun(n,arr,key);
       if(a!=-1)
       System.out.println("Index of element is "+a);
       else
       System.out.println(a);
    }
}
