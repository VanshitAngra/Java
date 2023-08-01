package arr;

import java.util.*;

public class swaptwoarrays {
    public static void swap(int[] arr,int[] arr1)
    {
        int[] temp=arr;
        arr=arr1;
        arr1=temp;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int l=ob.nextInt();
        int[] arr=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=ob.nextInt();
        }
        int l2=ob.nextInt();
        int[] arr1=new int[l2];
        for(int i=0;i<l2;i++)
        {
            arr1[i]=ob.nextInt();
        }
        swap(arr, arr1);
    }
}
