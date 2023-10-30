package endtermPrep;

import java.util.ArrayList;
import java.util.Scanner;

public class stock {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=i;j>0;j--)
            {
                if(arr[i]>arr[j])
                c++;
            }
            a.add(c);
        }
        System.out.println(a);
    }
}
