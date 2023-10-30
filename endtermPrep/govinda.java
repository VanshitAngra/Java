package endtermPrep;

import java.util.*;

//sumof digits=sumofprimefactors
public class govinda {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a=n;
        int sum=0,sum2=0;
        for(int i = 2; i<=n; i++) {
            while(n%i == 0) {
                sum+=i;
               n = n/i;
            }
         }
        while(a>0)
        {
            int r=a%10;
            sum2=sum2+r;
            a/=10;
        }
         if(sum==sum2)
        System.out.println("1");
         else
        System.out.println("0");
        ob.close();
    }
}
