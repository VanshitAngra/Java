import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        int n=s.length();
        char[] c=s.toCharArray();
        int flag=1;
        for(int i=0;i<n/2;i++)
        {
            if(c[i]!=c[n-i-1])
            flag=0;
        }
        if(flag==1)
        System.out.println("palindrome");
        else
        System.out.println("not");
    }
}
