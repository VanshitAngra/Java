package endtermPrep;

import java.util.Scanner;
//electronics letois
public class length {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a=ob.next();
        a+=" ";
        char[] s=a.toCharArray();
        for(int i=0;i<s.length-1;i+=2)
        {
            if(s[i]>s[i+1])
            System.out.print(s[i]);
            else if(s[i]<s[i+1])
            System.out.print(s[i+1]);
            else
            System.out.print(s[i]);
        }
        ob.close();
    }
}
