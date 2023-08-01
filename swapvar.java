import java.util.Scanner;

public class swapvar {
    public static void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"  "+b);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        swap(a,b);

    }
}
