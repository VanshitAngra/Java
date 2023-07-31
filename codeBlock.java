import java.util.*;
public class codeBlock {
    public static void main(String args[]) {
        // Scanner ob=new Scanner(System.in);
        // int t=ob.nextInt();
        // for(int i=0;i<t;i++)
        // {
        //     int car=ob.nextInt();
        //     boolean f=true;
        //     int o=0,e=0;
        //     while(car>0)
        //     {
        //         int r=car%10;
        //         if(r%2==0)
        //         e+=r;
        //         else
        //         o+=r;
        //         car/=10;
        //     }
        //     if(o%3==0)
        //     System.out.println("Yes");
        //     else if(e%4==0)
        //     System.out.println("Yes");
        //     else
        //     System.out.println("No");
        // }
        Scanner ob=new Scanner(System.in);
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        int a=1;
        for(int i=1;i<=(n1*n2);i++)
        {
            if(i%n1==0 && i%n2==0)
            {
            a=i;
            break;
            }
        }
        System.out.println(a);
    }
}
