package endtermPrep;
import java.util.*;
//100 200 300
//300 200 100
public class aliceAndBob {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        a[i]=ob.nextInt();
        for(int i=0;i<n;i++)
        b[i]=ob.nextInt();

        int s=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==b[i])
            s++;
            else if(a[i]*2<b[i])
            continue;
            else if (b[i]*2<a[i])
            continue;
            else
            s++;
        }
        System.out.println(s);
        ob.close();
    }
}
