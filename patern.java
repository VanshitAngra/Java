import java.io.*;
import java.util.*;
public class patern {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        int n=ob.nextInt();
        // *****
        // ****
        // ***
        // **
        // *      
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=n;j>=i;j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
// *****
//  ****
//   ***
//    **
//     *
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    //      *
    //     **
    //    ***
    //   ****
    //  *****
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=n;j>i;j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // * * * * * 
            // * * * * 
                // * * * 
                    // * * 
                        // *
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<2*i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<n-i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
//           * 
//         * * * 
//       * * * * * 
//     * * * * * * * 
//   * * * * * * * * * 
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=1;j<n-i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<=2*i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
//           * 
//         * ! * 
//       * ! * ! * 
//     * ! * ! * ! * 
//   * ! * ! * ! * ! * 
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=1;j<n-i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<=2*i;j++)
        //     {
        //         if(j%2==0)
        //         System.out.print("* ");
        //         else 
        //         System.out.print("! ");
        //     }
        //     System.out.println();
        // }
        // * * * * * 
        //     * * * * 
        //         * * * 
        //             * * 
        //                 * 
        //             * * 
        //         * * * 
        //     * * * * 
        // * * * * * 
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<2*i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<n-i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();

        // }
        // for(int i=n-1;i>0;i--)
        // {
        //     for(int j=2;j<2*i;j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=n;j>i-1;j--)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
       
        // }
// * * * * * * * 
// * * *   * * * 
// * *       * * 
// *           * 
// * *       * * 
// * * *   * * * 
// * * * * * * * 
        // for(int i=0;i<n/2 +1;i++)
        // {
        //     for(int j=i;j<n/2 +1;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<2*(i);j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<n/2-i+1;j++)
        //     {
        //         if(i==0&&j==0)
        //         continue;
        //         else
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n/2-1;i>=0;i--)
        // {
        //     for(int j=i;j<n/2 +1;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<2*(i);j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=0;j<n/2-i+1;j++)
        //     {
        //         if(i==0&&j==0)
        //         continue;
        //         else
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
// *               * 
// * *           * * 
// * * *       * * * 
// * * * *   * * * * 
// * * * * * * * * * 
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<2*(n-i);j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         if(i==n&&j==1)
        //         continue;
        //         else
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
//                 1
//         2       3       4
// 5       6       7       8       9
// 10      11      12      13      14      15      16
// 17      18      19      20      21      22      23      24      25
        // int a=1;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=1;j<n-i;j++)
        //     {
        //         System.out.print("\t");
        //     }
        //     for(int j=0;j<=2*i;j++)
        //     { 
        //         System.out.print(a+"\t");
        //         a++;
        //     }
        //     System.out.println();
        // }
//                 1
//         2       3       2
// 3       4       5       4       3
// 4       5       6       7       6       5       4
// 5       6       7       8       9       8       7       6       5
        // for(int i=0;i<n;i++)
        // {
        //     int a=i+1;
        //     for(int j=1;j<n-i;j++)
        //     {
        //         System.out.print("\t");
        //     }
        //     for(int j=0;j<=i;j++)
        //     { 
        //         System.out.print(a+"\t");
        //         a++;
        //     }
        //     a-=2;
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(a+"\t");
        //         a--;
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n/2+1;i++)
        {
            for(int j=i;j<=n-i;j++)
            {
                System.out.print("!");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            for(int j=)
            System.out.println();
        }
        ob.close();
    }
}
