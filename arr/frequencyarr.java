package arr;

import java.util.Arrays;
import java.util.Scanner;

public class frequencyarr {
        public static void main(String[] args) {
            Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        // for(int i=0;i<5;i++)
        // {
        //     int c=0;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(i==a[j])
        //         c++;
        //     }
        //     System.out.println(i+"  "+c);

        // }
        int[] freq=new int[n];
        for (int i = 0; i < a.length; i++) {
            freq[a[i]]++;            
        }
        int d=0;
        System.out.println(Arrays.toString(freq));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<freq[i];j++,d++)
            {
               a[d]=i;
            }
            
        }
        System.out.println(Arrays.toString(a));

        }
}
