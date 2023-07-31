//distinct elements
package arr;

import java.util.Scanner;

public class distinct {
    public static void main(String[] args) {
        Scanner ob=new Scanner (System.in);
        int n=ob.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("1");
                    return;
                }
            }
        }
        System.out.println("0");
    }
}
