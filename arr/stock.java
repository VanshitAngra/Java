package arr;

import java.util.*;

public class stock {
    public static void main(String[] args) {
        Scanner ob=new Scanner (System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int s=1;
        System.out.print("1 ");
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
            {
                s+=1;
                if(i<n-1)
                System.out.print(s+" ");
                else
                System.out.print(s+" END");
            }
            else
            {
                s=1;
                if(i<n-1)
                System.out.print(s+" ");
                else
                System.out.print(s+" END");
            }
            
        }
    }
}
