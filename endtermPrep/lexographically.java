package endtermPrep;
import java.util.*;

public class lexographically
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        String[] a=new String[n];
        ArrayList<String> temp=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            a[i]=ob.next();
        }
        String t=ob.next();
        for(int i=0;i<n;i++)
        {
            if(t.compareTo(a[i])<0)
            temp.add(a[i]);
        }
        System.out.println(temp);
        ob.close();
    }
}