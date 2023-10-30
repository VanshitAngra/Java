package endtermPrep;

import java.util.Scanner;

public class triplet {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
        int[] arr1=new int[a];
        int[] arr2=new int[b];
        int[] arr3=new int[c];
        for(int i=0;i<a;i++)
        {
            arr1[i]=ob.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            arr2[i]=ob.nextInt();
        }
        for(int i=0;i<c;i++)
        {
            arr3[i]=ob.nextInt();
        }
        int t=ob.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                for(int k=0;k<c;k++)
                {
                    if(arr1[i]+arr2[j]+arr3[k]==t)
                    System.out.println(arr1[i]+" "+arr2[j]+" "+arr3[k]);
                }
            }
        }
        ob.close();
    }
}

