/*1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1 */
package amcat;

import java.util.Scanner;

public class patern {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                a++;
                if(j!=i)
                System.out.print(a+"*");
                else
                System.out.print(a);
            }
            System.out.println();
        }
        for(int i=1;i<5;i++)
        {
            
        }
    }
}
