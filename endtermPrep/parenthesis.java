package endtermPrep;

import java.util.*;

public class parenthesis {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            String s=ob.nextLine();
            String n="";
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['||s.charAt(i)==')'|| s.charAt(i)=='}'||s.charAt(i)==']')
                n+=s.charAt(i);
            }
            if(n.length()%2!=0)
            System.out.println("False");
            else
            {
                char[] arr=new char[n.length()];
                int i=-1;
                for(char c:n.toCharArray())
                {
                    if(c=='('||c=='{'||c=='[')
                    {
                        arr[++i]=c;
                    }
                    else
                    {
                        if(i>=0&&(arr[i]=='('&&c==')'||arr[i]=='{'&&c=='}'||arr[i]=='['&&c==']'))
                        i--;
                        else
                        {
                            System.out.println("false");
                            return;
                        }
                    }
                }
                if(i==-1)
                System.out.println("true");
                else
                System.out.println("false");

            }
        }  
    } 
}
