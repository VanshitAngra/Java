package str;
//palindromesubstring
import java.util.*;
public class pali {
    public static int check(String s)
    {
        int l=s.length();
        for(int i=0;i<l/2;i++)
        {
            if(s.charAt(i)!=s.charAt(l-i-1))
            return -1;
        }
        return l;

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int l=s.length();
        int max=-1,a=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<=l;j++)
            {
                String s1=s.substring(i,j);
                a=check(s1);
            }
            if(a>max)
            max=a;
        }
        System.out.println(max);

    }

}
