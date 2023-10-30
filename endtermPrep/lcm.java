package endtermPrep;
import java.util.*;/**
 * lcm
 */
public class lcm {

    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        int a;
        int h=1;
        if(n1<n2)
        a=n1;
        else
        a=n2;
        for(int i=1;i<a;i++)
        {
            if(n1%i==0&&n2%i==0)
            h=i;
        }
        System.out.println((n1*n2)/h);
        ob.close();
    }
}