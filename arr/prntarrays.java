package arr;

import java.util.Scanner;

public class prntarrays {
    public static void array(int l,int arr[])
    {
        for (int i = 0; i < l; i++) {
            System.out.println(arr[i]);
        }
    
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner( System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        array(n,arr);
    }
}
