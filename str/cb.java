package str;

import java.util.Scanner;

public class cb {
    public static void main(String[] args) {
        // String s="1234";
        // int n=Integer.parseInt(s);
        // System.out.println(n);
        // String s1=n+"";
        // System.out.println(s1);
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        String st;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j<=s.length()-i;j++)
            {
                boolean[] visited=new boolean(s.length());
                st=s.substring(j, j+i);
                int a=Integer.parseInt(st);
                // int c=0;
                // for(int k=2;k<a;k++)
                // {
                //     if(a%k==0)
                //     c=1;
                // }
                // if(c==0&&a!=1&&a!=0)
                if(CbNumber(a)&&isvisted(i,i+len,boolean[] visited))
                System.out.println(st+"\n");
            }
        }
    }
    public static boolean isvisited(int si,int ei,boolean[] visited)
    {
        for(int i=si;i<ei;i++)
        {
            if(visited[i]==true)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean CbNumber(int val)
    {
        int[] arr={2,3,5,7,11,13,17,19,23,29};
        if(val==0|| val==1)
        return false;
        for(int k:arr)
        {
            if(k==val)
            return true;
        }
        for(int k:arr)
        {
            if(val%k==0)
            {
                return false;
            }
        }
        return true;
    }
}
