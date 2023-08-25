package str;
//palindromesubstring
import java.util.*;
public class noOfSub {
    public static boolean check(String s)
    {
        int l=s.length();
        for(int i=0;i<l/2;i++)
        {
            if(s.charAt(i)!=s.charAt(l-i-1))
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int l=s.length();
        int c=0;
        boolean a=false;
        
        for(int i=0;i<l;i++)
        {
            
            for(int j=i+1;j<=l;j++)
            {
                String s1=s.substring(i,j);
                System.out.println(s1);
                a=check(s1);
                if(a&true)
                c++;
            }
            
  
        }
        System.out.println(c);

    }

}