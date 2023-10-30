package endtermPrep;

import java.util.*;

//input-aaabbccds      output-a3b2c2d1s1
public class compresedString {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        s+=" ";
        if(s.length()==0)
        System.out.println(" ");
        else
        {
            int i=0,a=1;
        for(i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                System.out.print(s.charAt(i)+""+a);
                a=1;
            }
            else{
                a++;
            }
        }
        ob.close();
    }
    }
}
