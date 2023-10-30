package endtermPrep;

import java.util.*;

// reverse each word 
public class reverse1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a=ob.nextLine();
        // String[] arr=a.split(" ");
        a+=" ";
        String n="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                System.out.print(n+" ");
                n="";
            }
            else
            n=a.charAt(i)+n;
        }
        ob.close();
    }
}
