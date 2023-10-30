package endtermPrep;

import java.util.Scanner;

public class exceptional {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                System.out.println("Invalid Name");
                return;
            }
        }
        int n=ob.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid Id");
            return;

        }
        double a=ob.nextDouble();
        if(a>0)
        System.out.println("Invalid salary");
        else
        System.out.println("Data processed");
       
        ob.close();
    }
}
