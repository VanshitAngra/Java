package str;

import java.util.Scanner;

public class reverseword {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        s=' '+s;
        String a="";
        String b="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)== ' ')
            {
                System.out.print(a+" ");
                a="";
            }
            else 
            a=s.charAt(i)+a;
            
        }
        ob.close();
    }
}
