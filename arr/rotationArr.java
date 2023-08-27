package arr;

import java.util.*;

public class rotationArr {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int k=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++)
        {
            if(i<k)
            System.out.print(arr[n-k+i]+" ");
            else
            System.out.print(arr[i-k]+" ");
        }
        
    }
}
