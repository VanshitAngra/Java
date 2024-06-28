package sixthsem;

import java.util.*;

public class subarray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        List<Integer> ls=new ArrayList<>();
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int k=ob.nextInt();
        int[] ans=new int[n-k+1];
        for(int i=0;i<n-1;i++)
        {
            int t=0,a=0;
            for(int j=i;j<i+k&&(i+k)<=n;j++)
            {
                if(arr[j]<0)
                {
                    a=arr[j];
                    t=1;
                    break;
                }
            }
            if(t==1&&i<n-k+1){
            ls.add(a);
        ans[i]=a;}
            else if(t==0&&i<n-k+1)
            {
                ls.add(0);
                ans[i]=0;
            }
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(ls);
    }
}
