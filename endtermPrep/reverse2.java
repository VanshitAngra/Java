package endtermPrep;
import java.util.*;
public class reverse2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        String a="";
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            a=arr[i]+a;
            else
            a=" "+arr[i]+a;
        }
        System.out.println(a);
        ob.close();
    }
}
