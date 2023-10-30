package recursion;

import java.util.Scanner;

public class fact {
    public static int fa(int n)
    {
        if(n==0)
        return 1;
        return n*fa(n-1);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a=fa(n);
        System.out.println(a);
    }    
}
