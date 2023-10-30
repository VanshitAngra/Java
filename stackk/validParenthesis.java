package stackk;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static boolean check(String s)
    {
        Stack<Character> str=new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='[')
            {
                str.push(x);
                continue;
            }
            if(str.isEmpty())
            return false;

            char ch;
            switch(x)
            {
                case ')':
                ch=str.pop();
                if(ch=='[' || ch=='{')
                return false;
                break;

                case '}':
                ch=str.pop();
                if(ch=='(' || ch=='[')
                return false;
                break;

                case ']':
                ch=str.pop();
                if(ch=='(' || ch=='{')
                return false;
            }

        }
        return(str.empty());

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        if(check(s))
        System.out.println("valid");
        else
        System.out.println("not");
    }
}
