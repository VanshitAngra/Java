package endtermPrep;

import java.util.*;

//reverse string by preserving spaces inbetween
public class reverse {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        char[] ch=s.toCharArray();
        int st=0;
        int e=s.length()-1;
        while(st<e)
        {
            if(ch[st]==' ')
            {
                st++;
                continue;
            }
            else if(ch[e]==' ')
            {
                e--;
                continue;
            }
            else
            {
                char t=ch[st];
                ch[st]=ch[e];
                ch[e]=t;
                st++;
                e--;
            }

        }
        System.out.println(String.valueOf(ch));
        ob.close();
    }
}
