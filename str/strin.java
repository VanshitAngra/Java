package str;
import java.util.*;

public class strin {
    public static void main(String[] args) {
        String s="Hello";
        String s1="abc";
        String s2= new String("abf");
        // System.out.println(s==s1);
        // System.out.println(s==s2);
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.length());
        // System.out.println(s1.charAt(2));
        // System.out.println(s1.compareTo(s2));
        // System.out.println(s.substring(1));        
        // System.out.println(s.substring(2));    
        // System.out.println(s.substring(0,s.length()-1));    
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            System.out.println(s.substring(i,j+1));
        }
    }
}
