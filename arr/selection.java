package arr;

import java.util.Arrays;
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int a=0;
        for(int i=0;i<n;i++)
        {
            a++;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
             System.out.println("After Pass"+a);
             System.out.println(Arrays.toString(arr));
             
        }
        System.out.println(Arrays.toString(arr));
    }
}
