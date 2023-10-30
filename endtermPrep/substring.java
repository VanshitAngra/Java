package endtermPrep;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<=s.length();j++)
            {
                System.out.print(s.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
}
