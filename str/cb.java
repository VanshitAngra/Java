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
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                st=s.substring(i, j+1);
                System.out.print(st+"\t");
            }
            System.out.println();
        }
    }
}
