// 2769
import java.util.*;
public class max {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        String a=ob.nextLine();
        String b=ob.nextLine();
        int c=Integer.parseInt(a);
        int d=Integer.parseInt(b);
        int a1=0,b1=0;
        int e=0;
        while(c>0)
        {
            int n=c%10;
            a1+=(n*Math.pow(2,e));
            e++;
            c/=10;
        }
        System.out.println(a1);
        
        e=0;
        while(d>0)
        {
            int n=d%10;
            b1+=(n*Math.pow(2,e));
            e++;
            d/=10;
        }
        System.out.println(b1);
        int s=a1+b1;
         System.out.println(s);
        e=0;
        int bin=0;
        while(s>0)
        {
            int r=s%2;
            bin+=(r*Math.pow(10,e));
            e++;
            s/=2;
        }
        System.out.println(bin);
    }
}
