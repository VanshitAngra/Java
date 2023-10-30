package endtermPrep;

import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        char[] key={'D','B','D','C','C','D','A','E','A','D'};
        char[][] arr=new char[n][10];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<10;j++)
            {
                arr[i][j]=ob.next().charAt(0);
            }
        }
        for (int i = 0; i < n; i++) {
            int a=0;
            for(int j=0;j<10;j++)
            {
                if(arr[i][j]==key[j])
                a++;
            }
            System.out.println(a);
        }
        ob.close();
    }
}
