package stackk;
import java.util.*;

public class findTheCelebrity {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int f=0;
        int[][] arr=new int[n][n];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=ob.nextInt();
            }
        } 
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(arr[i][j]==1&&i!=j)
        //         {
        //             f=1;
        //         }
        //     }
        //     if(f==0)
        //     {
        //         System.out.println(i);
        //         return;
        //     }
        //     f=0;
        // }
        // System.out.println("-1");
        for(int i=0;i< arr.length;i++)
        {
            st.push(i);
        }
        while (st.size() !=1) {
            int a=st.pop();
            int b=st.pop();
            
            if(arr[a][b] ==1)
            {
                st.push(b);
            }
            else{
                if(arr[b][a]==1)
                {
                    st.push(a);
                }
            }
        }
        System.out.println(st);
        boolean flag=false;
        int ans=st.pop();
        for(int i=0;i<arr.length;i++)
        {
            if(i!=ans&&arr[ans][i]==1||arr[i][ans]==0)
            {
                flag =true;
                break;
            }
        }
        if(flag)
        System.out.println(-1);
        else
        System.out.println(ans);

    }
}
