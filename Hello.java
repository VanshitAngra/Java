
import java.util.*;
public class Hello
{
    public void sub(int i,int j)
    {
        System.out.println(i-j);
    }
    public static void main(String[] args) {
        add(5, 7);
        Hello ob=new Hello();
        ob.sub(5, 7);
    }
    public static void add(int i,int j) {
        System.out.println(i+j);
        
    }
}