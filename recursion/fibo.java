package recursion;

import java.util.Scanner;

public class fibo {
    public static int f(int n)
    {
        if(n==0||n==1)
        return 1;
        return f(n-1)+f(n-2);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a= f(n);
        System.out.println(a);

      }
}
