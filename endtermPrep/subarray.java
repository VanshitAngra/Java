package endtermPrep;

import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.println(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
