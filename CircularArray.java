//918
import java.util.*;
public class CircularArray {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        int a=ob.nextInt();
        int[] n=new int[a];
        int sum=0;
        System.out.println();
        for(int i=0;i<n.length;i++)
        {
            n[i]=ob.nextInt();
        }
        for(int i=0;i<2*n.length;i++)
        {
            System.out.println(n[i%n.length]);
        }

    }
}
