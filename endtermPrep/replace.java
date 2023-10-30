package endtermPrep;

import java.util.Scanner;

//1010  -2
//00 -0
//10 -0
public class replace {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        s=s.replace("10", "");
        s=s.replace("00", "");
        System.out.println(s.length());
        ob.close();
    }
}
