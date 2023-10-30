package endtermPrep;

import java.util.Scanner;

public class message {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                if(i==0)
                System.out.print((char)(s.charAt(i)-32));
                else
                System.out.print(s.charAt(i));
            }
        }
        ob.close();
    }
}
