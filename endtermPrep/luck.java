package endtermPrep;

import java.util.Scanner;

//lucky number 371=3^3+7^3+1^3
public class luck {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a=n;
        String s=n+"";
        int sum=0;
        while(a>0)
        {
            int r=a%10;
            sum+=(int)Math.pow(r,s.length());
            a/=10;

        }
        if(sum==n)
        System.out.println("true");
        else
        System.out.println("false");
        ob.close();
    }
}
