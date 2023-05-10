package stackk;

import java.util.Arrays;
import java.util.Scanner;

public class stockSpan {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        int arr2[]=new int[n];
        int a=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[i])
                a++;
            }
            arr2[i]=a;
            a=1;
        }
    }
}
