package str;

import java.util.Scanner;

public class firstoccurance {
    static int check(String a,String b)
    {
        int l1=a.length();
        int l2=b.length();
        if(l1<l2)
        return -1;
        for(int i=0;i<l1;i++)
        {
            int j=0;
            while(j<l2&&a.charAt(i+j)==b.charAt(j))
            j++;
            if(j==l2)
            return i;
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s1=ob.nextLine();
        String s2=ob.nextLine();
        System.out.println(check(s1, s2));
    }
}
