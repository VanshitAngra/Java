package endtermPrep;

import java.util.*;

public class toggle {
    public static void main(String[] args) {
         Scanner ob=new Scanner(System.in);
         String s=ob.next();
         for(int i=0;i<s.length();i++)
         {
            if(s.charAt(i)>=65&&s.charAt(i)<=90)
            System.out.print((char)(s.charAt(i)+32));
            else if(s.charAt(i)>=97&&s.charAt(i)<=122)
            System.out.print((char)(s.charAt(i)-32));
            else
            System.out.print(s.charAt(i));
            ob.close();
         }
    }
}
