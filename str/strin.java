package str;
import java.util.*;

public class strin {
    public static void main(String[] args) {
        String s="abc";
        String s1="abc";
        String s2= new String("abf");
        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.compareTo(s2));        
    }
}
