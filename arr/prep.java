package arr;

import java.util.Arrays;
import java.util.Scanner;

public class prep {
    public static void main(String[] args) {
        Scanner ob=new Scanner( System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[n-i-1]=ob.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
