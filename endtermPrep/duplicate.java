package endtermPrep;

import java.util.*;

//banana banana  programming programing
public class duplicate {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a=ob.next();
        a+=" ";
        // char[] s=a.toCharArray();
        // for (int i = 0; i < s.length-1; i++) {
        //     // if(s[i]==s[i+1])
        //     // System.out.print(s[i]);
        //     // else
        //     // {
        //     //     System.out.print(s[i]);
        //     //     i++;
        //     // }
        //     if(s[i]==s[i+1])
        //     {
        //         int j=i+1;
        //         while(j<s.length)
        //         {
        //             if(s[i]==s[j])
        //             i++;
        //             else
        //             break;
        //             j++;
        //         }
        //         System.out.print(s[i-1]);
        //     }
        //     else
        //     System.out.print(s[i]);
        // }
        for(int i=0;i<a.length()-1;i++)
        {
            if(a.charAt(i)!=a.charAt(i+1))
            {
                System.out.print(a.charAt(i));
                // a=1;
            }
            // else{
                // i++;
            // }
        }
        ob.close();
    }
}
