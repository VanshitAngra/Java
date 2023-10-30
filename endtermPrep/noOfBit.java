package endtermPrep;

import java.util.*;

public class noOfBit {
    public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    int a=0;
    int i=1,t;
    while(i<=n)
    {
        t=i;
        while(t>0)
        {
            if((t&1)==1)
            a++;
            t>>=1;
        }
        i++;
    }
    System.out.println(a);
    ob.close();
}
}
