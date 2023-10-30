package endtermPrep;

import java.util.*;
//(3k+2)
public class math {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        int a=1;
        int i=1;
        while(a<=n)
        {
            if(((3*i)+2)%m!=0)
            {
                a++;
                System.out.println((3*i)+2);
            }
            i++;
            ob.close();
        }
    }
}
