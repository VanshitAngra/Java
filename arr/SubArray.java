package arr;
// maximum sum of the SubArray
// time complexity O(n)=n^3
import java.util.*;
// public class SubArray {
//     public static void main(String[] args) {
//         Scanner ob= new Scanner(System.in);
//         int a=ob.nextInt();
//         int[] n=new int[a];
//         int sum=0;
//         for(int i=0;i<n.length;i++)
//         {
//             n[i]=ob.nextInt();
//         }
//         // for(int i=0;i<n.length;i++)
//         // {
           
//         //     for(int j=i;j<n.length;j++)
//         //     {
//         //         int s=0;
//         //         for(int k=i;k<=j;k++)
//         //         {
//         //             s+=n[k];
//         //         }
//         //         if(s>sum)
//         //         sum=s;
//         //     }
//         // }
//         // System.out.println(sum);
//         System.out.println(kandens(n));
//         ob.close();
//     }
//     public static int kandens(int[] n) {
//         int ans=Integer.MIN_VALUE;
//         int sum=0;
//         for(int i=0;i<n.length;i++)
//         {
//             sum+=n[i];
//             ans=Math.max(ans, sum);
//             if(sum<0)
//             sum=0;
//         }
//         return ans;
        
//     }

// }
public class SubArray
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
