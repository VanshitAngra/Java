package arr;

import java.util.*;

public class leet41 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();

        int min=1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int[] arr1=new int[n+2];
        for(int i=0;i<n+2;i++)
        {
            arr1[arr[i]]=arr[i];
        } 
        System.out.println(Arrays.toString(arr1));
    }
}
