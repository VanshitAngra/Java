package endtermPrep;

import java.util.*;

// public class subsequence {
    
//     static ArrayList<String> arr=new ArrayList<>();
//     public static void fsubsequence(String s,String ans)
//     {
//         if(s.length()==0)
//         {
//             arr.add(ans);
//             return;

//         }
//         fsubsequence(s.substring(1), ans+s.charAt(0));
//         fsubsequence(s.substring(1), ans);
//     }

//     public static void main(String[] args) {
//         Scanner ob=new Scanner(System.in);
//         String s=ob.next();
//         fsubsequence(s,"");
//         System.out.println(arr);
//         ob.close();
//     }
// }
/**
 * subsequence
 */
public class subsequence {

    public static void main(String[] args) {
        String s="abc";
        subsec(rev(s),"");
        
    }
    static void subsec(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(rev(ans));
            return;
        }
        subsec(s.substring(1),ans);
        subsec(s.substring(1),ans+s.charAt(0));
    }
    public static String rev(String s)
    {
        String n="";
        for(int i=s.length()-1;i>=0;i--)
        {
            n+=s.charAt(i);
        }
        return n;
    }
}
