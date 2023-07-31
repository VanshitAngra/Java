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
//                                  1
//                          2       3       4
//                  5       6       7       8       9
//         10      11      12      13      14      15      16
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
        // for(int i=1;i<=n/2+1;i++)
        // {
        //     for(int j=i+1;j<=n-i;j++)
        //     {
        //         System.out.print(j+"\t");
        //     }
        //     for(int j=i;j>0;j--)
        //     {
        //         System.out.print(j+"\t");
        //     }
            // for(int j=)
            // System.out.println();
        // }
        // }
        // 1
        // 2 * 2
        // 3 * 3 * 3
        // 4 * 4 * 4 * 4
        // 5 * 5 * 5 * 5 * 5
        // 4 * 4 * 4 * 4
        // 3 * 3 * 3
        // 2 * 2
        // 1
        // for(int i=1;i<2*n;i++)
        // {
        //     if(i<=n){
                
        //         for(int j=1;j<=i;j++)
        //         {
        //             if(i==j)
        //             System.out.print(i+" ");
        //             else
        //              System.out.print(i+" * ");
                    
    
        //         }
        //         System.out.println();
        //     }
        //     else
        //     {
        //         for(int j=i;j<2*n;j++)
        //         {
        //             if(j==2*n-1)
        //             System.out.print(2*n-i+" ");
        //             else
        //             System.out.print(2*n-i+" * ");
        //         }
        //         System.out.println();
        //     }
        // }
    //       1
    //     2 3 2
    //   3 4 5 4 3
    //     2 3 2
    //       1
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print("\t");
                }
                int a=i;
                for(int j=i;j>=1;j--){
                    System.out.print(a+"\t");
                    a++;
                }
                int b=a-2;
                for(int j=2;j<=i;j++){
                    System.out.print(b+"\t");
                    b--;
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                for(int j=1;j<=(n-i);j++){
                    System.out.print("\t");
                }
                int a=i;
                for(int j=i;j>=1;j--){
                    System.out.print(a+"\t");
                    a++;
                }
                int b=a-2;
                for(int j=2;j<=i;j++){
                    System.out.print(b+"\t");
                    b--;
                }
                System.out.println();
            }
        ob.close();
    }
}

// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int N = sc.nextInt();
//         drawPattern(N);
//     }
//     static void drawPattern(int N)
//     {
//         int n = N;
//         int row = 1;
 
        
//         int nst = 1;
 
//         int nsp1 = n - 1;
//         int nsp2 = -1;
//         int val1 = row;
//         int val2 = 1;
 
//         while (row <= n) {
//             int csp1 = 1;
//             while (csp1 <= nsp1) {
//                 System.out.print("  ");
//                 csp1 = csp1 + 1;
//             }
 
            
//             int cst1 = 1;
//             while (cst1 <= nst) {
//                 System.out.print(val1 + " ");
//                 val1 = val1 - 1;
//                 cst1 = cst1 + 1;
//             }
//             int csp2 = 1;
//             while (csp2 <= nsp2) {
//                 System.out.print("  ");
//                 csp2 = csp2 + 1;
//             }
//             if (row != 1 && row != n) {
//                 int cst2 = 1;
//                 while (cst2 <= nst) {
//                     System.out.print(val2 + " ");
//                     val2 = val2 + 1;
//                     cst2 = cst2 + 1;
//                 }
//             }
//             System.out.println();
 
            
//             if (row <= n / 2) {
//                 nst = nst + 1;
//                 nsp1 = nsp1 - 2;
//                 nsp2 = nsp2 + 2;
//                 val1 = row + 1;
//                 val2 = 1;
//             }
//             else {
//                 nst = nst - 1;
//                 nsp1 = nsp1 + 2;
//                 nsp2 = nsp2 - 2;
//                 val1 = n - row;
//                 val2 = 1;
//             }
//             row = row + 1;
//         }
//     }
// }