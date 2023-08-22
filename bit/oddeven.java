package bit;

import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        int n=ob.nextInt();
        if((n&1)==1)
        System.out.println("odd");
        else
        System.out.println("even");
    }
}
