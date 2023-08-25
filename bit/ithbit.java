package bit;

import java.util.Scanner;

//to check the ith bit is set or not
public class ithbit {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        int n=ob.nextInt();
        int a=ob.nextInt();
        int c=(int)Math.pow(2,a);
        if((n&c)!=0)
        System.out.println("True");
        else
        System.out.println("False");

    }
}
