package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generate {
    public static List<String> paren(int n)
    {
        List<String> list=new ArrayList<String>();
        check(list, "", 0, 0, n);
        return list;
    }
    public static void check(List<String> list,String s,int open ,int close ,int max)
    {
        if(s.length()==max*2)
        list.add(s);
        if(open<max)
        check(list, s+"(",open+1, close,max);
        if(close<open)
        check(list, s+")", open, close+1, max);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        List a=paren(n);
        System.out.println(a);

    }
}
