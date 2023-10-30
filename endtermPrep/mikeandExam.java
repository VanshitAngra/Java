package endtermPrep;

import java.util.*;

public class mikeandExam {

    public static int find(int[] arr,int n,int i,int k)
    {
        if(i>=n&&k!=0)
        return 0;
        if(k==0)
        return 1;

        return find(arr,n,i+1,k)+find(arr,n,i+1,k+arr[i])+find(arr,n,i+1,k-arr[i]);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=ob.nextInt();
            int key=ob.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=ob.nextInt();
            }
            System.out.println(find(arr, n, 0, key));
        }
        ob.close();
    }
}
