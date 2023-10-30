package endtermPrep;

import java.util.Scanner;

public class longestLength {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        s+=" ";
        int max=-1;
        String n="";
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)==' ')
            {
                if(n.length()>max)
                max=n.length();
                n="";
            }
            else
            n+=s.charAt(i);

        }
        System.out.println(max);
        ob.close();
    }
}
