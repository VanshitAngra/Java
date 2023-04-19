import java.util.*;
import javax.lang.model.util.ElementScanner14;
// public class linearSearch{
//     public static void main(String[] args) {
//         Scanner ob = new Scanner(System.in);
//         int[][] arr =new int[5][5];
//         int k=ob.nextInt();
//         int a=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr[0].length)
//             {
//             arr[i]=ob.nextInt();}
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr[0].length;j++)
//             {
//                 if(arr[i][j]==k)
//             {
//                 a=1;
//                 break;
//             }
//             }
import javax.swing.plaf.synth.SynthDesktopIconUI;
            
//         }
//         if(a==1)
//         System.out.println("Present");
//         else
//         System.out.println("Not present");
//         ob.close();

//     }
// }
public class linearSearch
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=ob.nextInt();
        int m=ob.nextInt();
        int target=ob.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=ob.nextInt();
            }
        }
        int row=0;
        int col=m-1;
        boolean f=false;
        while(row<n && col>=0)
        {
            if(arr[row][col]==target)
            {
                f=true;
                break;
            }
            else if(arr[row][col]<target)
            {
                row++;
            }
            else
            col--;
        }
        if(f)
        System.out.println("Element present");
        else
        System.out.println("Element not found ");
    }
}