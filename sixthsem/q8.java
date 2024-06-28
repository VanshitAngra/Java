package sixthsem;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        while(t-- >0){
            String s=ob.nextLine();
            if(s.equals("es"))
            System.out.println("Yes");
            else if(check(s))
            System.out.println("Yes");
            else
            System.out.println("No");

        }
    }
    public static boolean check(String s)
    {
        if(s.isEmpty())
        return false;
        if(s.equals("Yes")) return true;
        if(s.equals("esY")) return true;
        if(s.equals("sYes")) return true;

        return check(s.substring(1));
    }
}
