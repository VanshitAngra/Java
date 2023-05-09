package abst;

import java.util.Scanner;

public abstract class Abstract_Demo1 {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
    public void sub(int a,int b)
    {
        int c=a-b;
        System.out.println(c);
    }
}
